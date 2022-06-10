
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class workServlet
 */
@WebServlet("/workers")
public class workServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public workServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");
		if (op == null)
			return;
		String va1 = request.getParameter("val1");
		String va2 = request.getParameter("val2");
		int p = Integer.parseInt(va1);
		int q = Integer.parseInt(va2);
		if (op.equals("plus")) {
			response.getWriter().append(p + "+" + q + "=" + (p + q));
		}
		if (op.equals("minus")) {
			response.getWriter().append(p + "-" + q + "=" + (p - q));

		}
		if (op.equals("multi")) {
			response.getWriter().append(p + "X" + q + "=" + (p * q));

		}
		if (op.equals("div")) {
			double p1=p;
			double q1=q;
			response.getWriter().append(p + "/" + q + "=" + (p1 / q1));

		}

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
