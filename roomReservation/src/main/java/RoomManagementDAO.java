import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RoomManagementDAO {
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
	
	ArrayList<RoomManagementDTO> Roomlist() {
		ArrayList<RoomManagementDTO> list = new ArrayList<RoomManagementDTO>();
		try {
			connDB();
			String query = "select * from roomservice";
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int Roomnumber = rs.getInt("roomnumber");
				String type = rs.getString("roomtype");
				String name = rs.getString("roomname");
				int min = rs.getInt("min");
				int price = rs.getInt("price");
				RoomManagementDTO dto = new RoomManagementDTO();
				dto.setRoomNumber(Roomnumber);
				dto.setRoomType(type);
				dto.setRoomName(name);
				dto.setMin(min);
				dto.setPrice(price);
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
	
	void insertRoom(RoomManagementDTO dto) {
		try {
			connDB();
			String query = "insert into roomservice values(roomnumber.nextval,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, dto.getRoomName());
			psmt.setInt(2, dto.getMin());
			psmt.setInt(3, dto.getPrice());
			psmt.setInt(4, dto.getRoom_type());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void updateRoom(int room_id, String room_name, String room_type, int min, int price) {
		try {
			connDB();
			String query="update roomservice set roomname=?, roomtype=?,"
					+ " min=?, price=? where roomnumber=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, room_name);
			pstmt.setString(2, room_type);
			pstmt.setInt(3, min);
			pstmt.setInt(4, price);
			pstmt.setInt(5, room_id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	void deleteRoom(int room_id) {
		try {
			connDB();
			String query = "delete from roomservice where roomnumber=? ";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, room_id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
