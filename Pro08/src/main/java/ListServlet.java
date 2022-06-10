

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/List")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String outstr="";
		HomeDAO dao =new HomeDAO();
		ArrayList<HomeDTO> list = dao.Homelist();
		for (int i = 0; i < list.size(); i++) {
			HomeDTO data = new HomeDTO();
			data = list.get(i);
			outstr += "<tr><td>"+data.getCountry()+"</td><td>"+data.getSeq()+"</td><td>"+data.getGoods()+"</td>"+"<td><input type=button id=btnDelete value='»èÁ¦'></td></tr>";
		
		}
		response.getWriter().print(outstr);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
