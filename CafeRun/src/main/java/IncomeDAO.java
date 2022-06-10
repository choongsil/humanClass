import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class IncomeDAO {
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

	public int getSum() {
		int sum = 0;
		try {
			connDB();
			String query = "select sum(price) as total from income";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			sum = rs.getInt("total");
			System.out.println("total"+sum);
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sum;
	}

	void insert(IncomeDTO dto) {
		try {
			connDB();
			String query = "insert into income values(?,?,?,?,to_char(sysdate,'YY-MM-DD HH24:MI:SS'))";
			PreparedStatement psmt = conn.prepareStatement(query);
			System.out.println(dto.getMobile());
			System.out.println(dto.getSeqno());
			System.out.println(dto.getQty());
			System.out.println(dto.getPrice());
			psmt.setString(1, dto.getMobile());
			psmt.setInt(2, dto.getSeqno());
			psmt.setInt(3, dto.getQty());
			psmt.setInt(4, dto.getPrice());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	ArrayList<IncomeDTO> Incomelist() {
		ArrayList<IncomeDTO> list = new ArrayList<IncomeDTO>();
		try {
			connDB();
			String query = "select a.mobilenum, b.name, a.qty,a.price, a.incom_date" + " from income a, menu b"
					+ " where a.seqno=b.seqno order by a.incom_date";
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String mobile = rs.getString("mobilenum");
				String menuname = rs.getString("name");
				int qty = rs.getInt("qty");
				int price = rs.getInt("price");
				String date = rs.getString("incom_date");
				IncomeDTO dto = new IncomeDTO();
				dto.setDate(date);
				dto.setMobile(mobile);
				dto.setPrice(price);
				dto.setQty(qty);
				dto.setMenuname(menuname);
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
}
