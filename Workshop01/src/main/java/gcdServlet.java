
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gcdServlet
 */
@WebServlet("/gcdServlet")
public class gcdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public gcdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

//		String val1=request.getParameter("val1");
//		String val2=request.getParameter("val2");
//		if(val1==null)return;
//		int x = Integer.parseInt(request.getParameter("val1"));
//		int y = Integer.parseInt(request.getParameter("val2"));
//		int u =0;
//		int min=0;
//		if (x<y) {
//			min=x;
//		} else {
//			min = y;
//		}
//		for(int i=1;i<min;i++) {
//			if(x%i==0 && y%i==0) {
//				u=i;
//			}
//		}
//		response.getWriter().append("두수의 최소공배수"+"="+(x*y)/u+"<br>");
//		response.getWriter().append("두수의 최대공약수"+"="+u);
//		String val1=request.getParameter("val1");
//		if(val1==null)return;
//		int x= Integer.parseInt(val1);
//		int y=0;
//		for(int i=1;i<x;i++) {
//			if(x%i==0)
//				y=i;
//		}
//		response.getWriter().append("ㅅ"+y);
		
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
