import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ReservationDAO {
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
	//예약 불가능한 객실 찾기
	ArrayList<ReservationDTO> Reservelist(int room_type, int cnt, String checkin, String checkout) {
		ArrayList<ReservationDTO> list = new ArrayList<ReservationDTO>();
		try {
			connDB();
			String query = "select b.roomnumber, b.roomname, a.renum, a.checkin, a.checkout, a.name"
					+ " from reserve a, roomservice b"
					+ " where b.roomtype=? and a.recnt>=?"
					+ " and (a.checkin between ? and ? or a.checkout between ? and ?"
					+ " or(a.checkin <= ? and a.checkout >= ?))"
					+ " and a.reroomnum = b.roomnumber";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, room_type);
			psmt.setInt(2, cnt);
			psmt.setString(3, checkin);
			psmt.setString(4, checkout);
			psmt.setString(5, checkin);
			psmt.setString(6, checkout);
			psmt.setString(7, checkin);
			psmt.setString(8, checkout);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int roomnumber=rs.getInt("roomnumber");
				int renum=rs.getInt("renum");
				String roomname=rs.getString("roomname");
				String checkin1=rs.getString("checkin");
				String checkout2=rs.getString("checkout");
				String name=rs.getString("name");
				ReservationDTO dto = new ReservationDTO();
				dto.setRoomnum(roomnumber);
				dto.setRoomName(roomname);
				dto.setCheckin(checkin1);
				dto.setCheckout(checkout2);
				dto.setName(name);
				dto.setRenum(renum);
				list.add(dto);
			}
			rs.close();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	//예약가능객실불러오기
	ArrayList<ReservationDTO> noreservelist(int room_type, int cnt, String typename,
										String checkin, String checkout ) {
		ArrayList<ReservationDTO> list = new ArrayList<ReservationDTO>();
		try {
			connDB();
			String query = "select roomnumber, roomname, price, min from roomservice"
						+ " where roomtype=? and min>=?"
						+ " and roomnumber not in"
						+ " (select reroomnum from reserve"
						+ " where roomtype=? and recnt>=?"
						+ " and(checkin between ? and ? OR checkout between ? and ?"
						+ " or(checkin <= ? and checkout >= ?)))";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, room_type);
			psmt.setInt(2, cnt);
			psmt.setString(3, typename);
			psmt.setInt(4, cnt);
			psmt.setString(5, checkin);
			psmt.setString(6, checkout);
			psmt.setString(7, checkin);
			psmt.setString(8, checkout);
			psmt.setString(9, checkin);
			psmt.setString(10, checkout);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int roomnumber=rs.getInt("roomnumber");
				String roomname=rs.getString("roomname");
				int min = rs.getInt("min");
				int price=rs.getInt("price");
				ReservationDTO dto = new ReservationDTO();
				dto.setRoomnum(roomnumber);
				dto.setRoomName(roomname);
				dto.setPrice(price);
				dto.setMin(min);
				list.add(dto);
			}
			rs.close();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//예약취소
	void delete(int renum) {
		try {
			connDB();
			String query = "delete from reserve where renum=? ";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, renum);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//예약 내역 불러오기
	ArrayList<ReservationDTO> update(int renum) {
		ArrayList<ReservationDTO> list=new ArrayList<ReservationDTO>();
		try {
			connDB();
			String query = "select a.renum, b.roomname, a.recnt, a.reprice, a.name, a.mobile, a.checkin, a.checkout, c.type_name"
					+ " from reserve a, roomservice b, roomtype c"
					+ " where a.reroomnum=b.roomnumber and a.roomtype=c.type_id"
					+ " and a.renum=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, renum);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int renum1=rs.getInt("renum");
				String roomname=rs.getString("roomname");
				int min = rs.getInt("recnt");
				int price=rs.getInt("reprice");
				String name=rs.getString("name");
				String mobile=rs.getString("mobile");
				String checkin=rs.getString("checkin");
				String checkout=rs.getString("checkout");
				String typename=rs.getString("type_name");
				ReservationDTO dto = new ReservationDTO();
				dto.setRenum(renum);
				dto.setRoomName(roomname);
				dto.setRecnt(min);
				dto.setPrice(price);
				dto.setName(name);
				dto.setMobile(mobile);
				dto.setCheckin(checkin);
				dto.setCheckout(checkout);
				dto.setTypename(typename);
				list.add(dto);
			}
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	//예약수정
	void updatereserve(ReservationDTO dto) {
		try {
			connDB();
			String query = "update reserve set name=?, mobile=?, recnt=? where renum=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getMobile());
			psmt.setInt(3, dto.getRecnt());
			psmt.setInt(4, dto.getRenum());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
