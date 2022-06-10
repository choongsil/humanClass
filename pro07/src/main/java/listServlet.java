

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listServlet
 */
@WebServlet("/list")
public class listServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		MemberDAO dao = new MemberDAO();
		String outstr="";
		ArrayList<MemberVO> list = dao.listMember();
		for (int i = 0; i < list.size(); i++) {
			MemberVO data = new MemberVO();
			data = list.get(i);
			outstr += "<tr><td>"+data.getId()+"</td><td>"+data.getPwd()+"</td><td>"+data.getName()+"</td><td>"+
			data.getMobile()+"</td><td>"+data.getJoinDate()+"</td><td><input type=button id=btnDelete value='»èÁ¦'></td></tr>";
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
