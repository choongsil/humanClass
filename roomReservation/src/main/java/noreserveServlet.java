

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
 * Servlet implementation class noreserveServlet
 */
@WebServlet("/noreserve")
public class noreserveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public noreserveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationDAO dao=new ReservationDAO();
		int room_type=Integer.parseInt(request.getParameter("room_type")); 
		int cnt=Integer.parseInt(request.getParameter("cnt"));
		String typename=request.getParameter("typename");
		String checkin=request.getParameter("checkin");
		String checkout=request.getParameter("checkout");
		JSONArray ja = new JSONArray();
		ArrayList<ReservationDTO> list=dao.noreservelist(room_type, cnt, typename, checkin, checkout);
		for(int i=0;i<list.size();i++) {
			ReservationDTO dto =new ReservationDTO();
			dto = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("roomnum", dto.getRoomnum());
			jo.put("roomname", dto.getRoomName());
			jo.put("price", dto.getPrice());
			jo.put("min", dto.getMin());
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
