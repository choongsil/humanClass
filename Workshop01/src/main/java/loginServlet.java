

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String user_id=request.getParameter("user_id");
		String user_pw =request.getParameter("user_pw");
		String [] subject = request.getParameterValues("subject");
		System.out.println("get���̵�:"+user_id);
		System.out.println("get��й�ȣ:"+user_pw);
		response.getWriter().print("�ȳ�ȳ� ������� �ʴ� "+user_id+"<br>");
		response.getWriter().print("get��й�ȣ:"+user_pw +"<br>");
//		response.getWriter().print("���ɺо�:");
////		for(int i=0;i<subject.length;i++) {
//		for(String str:subject) {	
//			response.getWriter().print(str+",");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		String user_id=request.getParameter("user_id");
		String user_pw =request.getParameter("user_pw");
		System.out.println("post���̵�:"+user_id);
		System.out.println("post��й�ȣ:"+user_pw);
		response.getWriter().print("post���̵�:"+user_id);
		response.getWriter().print("post��й�ȣ:"+user_pw);

	}

}
