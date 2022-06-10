

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
 * Servlet implementation class updateServlet
 */
@WebServlet("/update")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationDAO dao=new ReservationDAO();
		int renum=Integer.parseInt(request.getParameter("renum"));
		ArrayList<ReservationDTO> list=dao.update(renum);
		JSONArray ja = new JSONArray();
		for(int i=0;i<list.size();i++) {
			ReservationDTO dto =new ReservationDTO();
			dto = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("renum", dto.getRenum());
			jo.put("roomname", dto.getRoomName());
			jo.put("typename", dto.getTypename());
			jo.put("recnt", dto.getRecnt());
			jo.put("checkin", dto.getCheckin());
			jo.put("checkout", dto.getCheckout());
			jo.put("name", dto.getName());
			jo.put("mobile", dto.getMobile());
			jo.put("price", dto.getPrice());
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
