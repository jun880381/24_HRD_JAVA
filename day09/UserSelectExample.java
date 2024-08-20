package day09;
/*
 *  1. JDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 *  
 */

import java.sql.*;

public class UserSelectExample {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 데이터 베이스 연결
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			conn = DriverManager.getConnection(url,id,pwd);
			System.out.println("DB 연결 성공");
			
			// 3. SQL문 실행하기 위한 Statement, PreparedStatement 객체 생성			
//			String sql = "INSERT INTO person VALUES ('김준태', '010-456-4566', 'kim@naver.com', 26)";
			
			String sql2 = "SELECT * FROM users WHERE userid = ? ";
			st = conn.prepareStatement(sql2);
			
			st.setString(1, "lee");
			// 4. 데이터 추가 명령 전송 하기 executeUpdate()
			ResultSet result = st.executeQuery();
			
			while (result.next()) {
				String userid = result.getString("userid");
				String username = result.getString("username");
				String userpassword = result.getString("userpassword");
				int age = result.getInt("userage");
				String useremail = result.getString("useremail");
				System.out.println("아이디 : " + userid);
				System.out.println("이름 : " + username);
				System.out.println("비밀번호 : " + userpassword);
				System.out.println("나이 : " + age);
				System.out.println("이메일 : " + useremail);
			}
			
			
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			System.out.println(e.getMessage());
			
		}finally {
			try {
			conn.close();
			System.out.println("연결 끊음");
			} catch(SQLException es) {
				
			}
			
		}


	}

}
