import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class HomeDAO {
	private Statement stmt;
	private Connection conn;
	
	private void connDB() { // DB와 연결
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "ora_user";
		String passcode = "human123";

		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, userid, passcode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<HomeDTO> Homelist() {
		ArrayList<HomeDTO> list = new ArrayList<HomeDTO>();
	try {
		connDB(); // DB 연결
		String query = "select * from exp_goods order by country, seq";
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query); // ResultSet class는 가져온 테이블(2차원 배열)을 저장하고있다.

		while (rs.next()) {
			HomeDTO dto  = new HomeDTO();
			dto.setCountry(rs.getString("country"));
			dto.setSeq(rs.getInt("seq"));
			dto.setGoods(rs.getString("goods"));			
			list.add(dto);
		}

		rs.close();
		stmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

	return list;
}
	
	void addnew(HomeDTO dto) {
		try {
			connDB();
			String query = "insert into exp_goods values(?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, dto.getCountry());
			psmt.setInt(2, dto.getSeq());
			psmt.setString(3, dto.getGoods());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void delete(String country, int seq, String goods) {
		try {
			connDB();
			String query = "delete from exp_goods where country=? and seq=? and goods=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, country);
			pstmt.setInt(2, seq);
			pstmt.setString(3, goods);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	void update(HomeDTO dto) {
		try {
			connDB();
			String query = "update exp_goods set goods=? where country=? and seq=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getGoods());
			pstmt.setString(2, dto.getCountry());
			pstmt.setInt(3, dto.getSeq());
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
