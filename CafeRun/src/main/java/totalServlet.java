

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
 * Servlet implementation class totalServlet
 */
@WebServlet("/total")
public class totalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public totalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf-8");
		IncomeDAO dao = new IncomeDAO();
		JSONArray ja = new JSONArray();
		
		ArrayList<IncomeDTO> list=dao.Incomelist();
		for(int i=0; i<list.size();i++) {
			IncomeDTO dto = new IncomeDTO();
			dto = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("mobile", dto.getMobile());
			jo.put("name", dto.getMenuname());
			jo.put("qty", dto.getQty());
			jo.put("price", dto.getPrice());
			jo.put("date", dto.getDate());
			ja.add(jo);
		}
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
