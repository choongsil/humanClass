import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ReserveDAO {
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

	// 예약 내역 DB에 넣기
	void insertReserve(int reroomnum, int recnt, int reprice, String name, String mobile,
						String checkin,	String checkout, int roomtype){
		try {
			connDB();
			String query = "insert into reserve values(reservenum.nextval,?,?,?,?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, reroomnum);
			psmt.setInt(2, recnt);
			psmt.setInt(3, reprice);
			psmt.setString(4, name);
			psmt.setString(5, mobile);
			psmt.setString(6, checkin);
			psmt.setString(7, checkout);
			psmt.setInt(8, roomtype);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	//예약 내역 DB에서 불러오기
	ArrayList<ReserveDTO> Reservelist() {
		ArrayList<ReserveDTO> list = new ArrayList<ReserveDTO>();
		try {
			connDB();
			String query = "select a.roomname,  b.checkin, b.checkout, b.recnt, b.name"
					+ " from roomservice a, reserve b"
					+ " where a.roomnumber=b.reroomnum";
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String roomname=rs.getString("roomname");
				String checkin = rs.getString("checkin");
				String checkout = rs.getString("checkout");
				int recnt=rs.getInt("recnt");
				String name=rs.getString("name");
				ReserveDTO dto = new ReserveDTO();
				dto.setRoomname(roomname);
				dto.setCheckin(checkin);
				dto.setCheckout(checkout);
				dto.setRecnt(recnt);
				dto.setName(name);
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
