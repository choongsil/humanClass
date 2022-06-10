
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addroomServlet
 */
@WebServlet("/addRoom")
public class addroomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addroomServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoomManagementDAO rdao= new RoomManagementDAO();
		RoomManagementDTO dto = new RoomManagementDTO();
		
		String roomname = request.getParameter("room_name");
		int roomtype = Integer.parseInt(request.getParameter("room_type"));
		int min = Integer.parseInt(request.getParameter("min"));
		int price = Integer.parseInt(request.getParameter("price"));
		System.out.println(roomname);
		System.out.println(roomtype);
		System.out.println(min);
		System.out.println(price);
		dto.setRoomName(roomname);
		dto.setRoom_type(roomtype);
		dto.setMin(min);
		dto.setPrice(price);
		rdao.insertRoom(dto);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
