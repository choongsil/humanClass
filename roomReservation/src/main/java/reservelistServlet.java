

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
 * Servlet implementation class reservelistServlet
 */
@WebServlet("/reservelist")
public class reservelistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reservelistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReserveDAO dao= new ReserveDAO();
		JSONArray ja = new JSONArray();
		ArrayList<ReserveDTO> list=dao.Reservelist();
		for(int i=0;i<list.size();i++) {
			ReserveDTO dto =new ReserveDTO();
			dto = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("renum", dto.getReroomnum());
			jo.put("roomname", dto.getRoomname());
			jo.put("checkin", dto.getCheckin());
			jo.put("checkout", dto.getCheckout());
			jo.put("recnt", dto.getRecnt());
			jo.put("name", dto.getName());
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
