

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
 * Servlet implementation class typeServlet
 */
@WebServlet("/typelist")
public class typeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public typeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TypeDAO tdao= new TypeDAO();
		ArrayList<TypeDTO> list=tdao.getlist();
		JSONArray ja = new JSONArray();
		for(int i=0;i<list.size();i++) {
			TypeDTO dto = new TypeDTO();
			dto=list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("type_id", dto.getType_id());
			jo.put("type_name", dto.getType_name());
			ja.add(jo);
		}
		response.setContentType("text/html; charset=utf-8");
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
