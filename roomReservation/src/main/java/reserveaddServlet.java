

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reserveaddServlet
 */
@WebServlet("/reserveadd")
public class reserveaddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reserveaddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReserveDAO dao = new ReserveDAO();
		
		dao.insertReserve(Integer.parseInt(request.getParameter("reroomnum")),
				Integer.parseInt(request.getParameter("recnt")),
				Integer.parseInt(request.getParameter("reprice")), 
				request.getParameter("name"), 
				request.getParameter("mobile"),
				request.getParameter("checkin"), 
				request.getParameter("checkout"),
				Integer.parseInt(request.getParameter("roomtype")));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
