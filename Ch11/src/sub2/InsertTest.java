package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 김지홍
 * 내용 : JDBC Insert 실습하기
 */

public class InsertTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");				
			
			// 2단계 - 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass); 
				
			// 3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
				
			// 4단계 - SQL 실행
			String sql = "INSERT INTO `user1` VALUES('A101', '김유신', '010-1234-1001', 25);";
			stmt.executeUpdate(sql);
				
			// 5단계 - 결과 처리(SELECT 경우만)
			// 6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("INSERT 완료...");
	}
}
