
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class menuUpdateServlet
 */
@WebServlet("/menuUpdate")
public class menuUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public menuUpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		menuDAO dao = new menuDAO();
		menuDTO dto = new menuDTO();
		String menuName = request.getParameter("menuName");
		int menuPrice = Integer.parseInt(request.getParameter("menuPrice"));
		int sqnum = Integer.parseInt(request.getParameter("sqnum"));
		dto.setMenuName(menuName);
		dto.setMenuPrice(menuPrice);
		dto.setSqNum(sqnum);
		dao.updatemenu(dto);
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
