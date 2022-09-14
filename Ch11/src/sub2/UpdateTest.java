package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 김지홍
 * 내용 : JDBC Update 실습하기
 */

public class UpdateTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			String sql = "UPDATE `User1` Set `name`='홍길동', `hp` ='010-1111-1111' ";
					sql += "WHERE `uid` = 'A101';";
							
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
		
	}
}
