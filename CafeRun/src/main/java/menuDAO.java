import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class menuDAO {
	private Statement stmt;
	private Connection conn;

	private void connDB() { // DB¿Í ¿¬°á
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

	ArrayList<menuDTO> menuList() {
		ArrayList<menuDTO> list = new ArrayList<menuDTO>();
		try {
			connDB();
			String query = "select * from menu order by seqno";
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int seqno = rs.getInt("seqno");
				String menuName = rs.getString("name");
				int menuPrice = rs.getInt("price");
				menuDTO dto = new menuDTO();
				dto.setSqNum(seqno);
				dto.setMenuName(menuName);
				dto.setMenuPrice(menuPrice);
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

	void addnew(menuDTO dto) {
		try {
			connDB();
			String query = "insert into menu values(sq.nextval,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, dto.getMenuName());
			psmt.setInt(2, dto.getMenuPrice());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void updatemenu(menuDTO dto) {
		try {
			connDB();
			String query = "update menu set name=?, price=? where seqno=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, dto.getMenuName());
			psmt.setInt(2, dto.getMenuPrice());
			psmt.setInt(3, dto.getSqNum());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void deleteMenu(String menuname) {
		try {
			connDB();
			String query = "delete from menu where name=? ";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, menuname);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
