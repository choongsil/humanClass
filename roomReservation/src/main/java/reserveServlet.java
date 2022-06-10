

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class reserveServlet
 */
@WebServlet("/reserve")
public class reserveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reserveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationDAO dao= new ReservationDAO();
		int room_type=Integer.parseInt(request.getParameter("roomtype")); 
		int cnt=Integer.parseInt(request.getParameter("cnt"));
		String checkin=request.getParameter("checkin");
		String checkout=request.getParameter("checkout");
		JSONArray ja = new JSONArray();
		ArrayList<ReservationDTO> list=dao.Reservelist(room_type, cnt, checkin, checkout);
		for(int i=0;i<list.size();i++) {
			ReservationDTO dto =new ReservationDTO();
			dto = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("roomname", dto.getRoomName());
			jo.put("roomnum", dto.getRoomnum());
			jo.put("checkin", dto.getCheckin());
			jo.put("checkout", dto.getCheckout());
			jo.put("name", dto.getName());
			jo.put("renum", dto.getRenum());
			ja.add(jo);
		}
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(ja.toJSONString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
