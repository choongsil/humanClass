import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TypeDAO {
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
	
	ArrayList<TypeDTO>getlist(){
		ArrayList<TypeDTO> list = new ArrayList<TypeDTO>();
		try {
			connDB();
			String query ="select * from roomtype";
			this.stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				TypeDTO tdto = new TypeDTO();
				tdto.setType_id(rs.getInt("type_id"));
				tdto.setType_name(rs.getString("type_name"));
				list.add(tdto);
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			
		}
		return list;
	}
}
