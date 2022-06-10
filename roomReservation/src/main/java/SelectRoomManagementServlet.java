

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
 * Servlet implementation class SelectRoomManagementServlet
 */
@WebServlet("/SelectRoom")
public class SelectRoomManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectRoomManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoomManagementDAO dao= new RoomManagementDAO();
		JSONArray ja = new JSONArray();
		ArrayList<RoomManagementDTO> list=dao.Roomlist();
		for(int i=0;i<list.size();i++) {
			RoomManagementDTO dto =new RoomManagementDTO();
			dto = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("roomnumber", dto.getRoomNumber());
			jo.put("roomtype", dto.getRoomType());
			jo.put("roomname", dto.getRoomName());
			jo.put("min", dto.getMin());
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
