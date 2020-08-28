import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class  JdbcDemo1 {
	private static final String DRIVER;
	private static final String URL;
	private static final String USER;
	private static final String PASSWD;

	static {
	
	DRIVER = "oracle.jdbc.driver.OracleDriver";
	URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	USER = "scott";
	PASSWD = "tiger";
}

	
	
	public static void main(String[] args)
	
	throws ClassNotFoundException, SQLException{
		ResultSet rs = null; // Ʋ������
	Class.forName(DRIVER); //2.
	Connection conn = DriverManager.getConnection(URL, USER, PASSWD); //3.
	Statement stmt = conn.createStatement(); //4.
	String sql = "SELECT sysdate FROM dual"; 
	stmt.executeQuery(sql); //5.
	while(rs.next()) { //6.
	java.util.Date today = rs.getDate(1);
	System.out.println(today);
}
	if(rs != null) rs.close();
	if(stmt != null) stmt.close();
	if(conn != null) conn.close();
}
}