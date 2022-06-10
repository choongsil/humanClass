

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class upTodateServlet
 */
@WebServlet("/uptodate")
public class upTodateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upTodateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationDAO dao= new ReservationDAO();
		ReservationDTO dto=new ReservationDTO();
		int renum=Integer.parseInt(request.getParameter("renum"));
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		int recnt=Integer.parseInt(request.getParameter("min"));
		dto.setRenum(renum);
		dto.setName(name);
		dto.setMobile(mobile);
		dto.setRecnt(recnt);
		dao.updatereserve(dto);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
