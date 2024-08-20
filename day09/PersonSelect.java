package day09;

/*	
 * 	1. JDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 */

import java.sql.*;
import java.util.ArrayList;

public class PersonSelect {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet result = null;
		Person ps = null;
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
			
			// String sql2 = "SELECT name, phone FROM person";
			// 이름이 홍길동과 같은 사람의 모든 열의 정보를 검색해서 출력
			
			String sql3 = "SELECT * FROM person ";
			
			// PreparedStatement st = conn.prepareStatement(sql2);
			
			st = conn.createStatement();
			
			
			// 4. 데이터 조회 명령 전송 하기 executeQuery()
			result = st.executeQuery(sql3);
			
			ArrayList<Person> arrlist = new ArrayList<Person>();
			
			while(result.next()) {
				String name = result.getString("name");
				String phone = result.getString("phone");
				String email = result.getString("email");
				int age = result.getInt("age");
				
				ps = new Person(name, phone, email, age);
				arrlist.add(ps);
				
			}
			
			for(Person p : arrlist) {
				System.out.println("-------------------------");
				System.out.println("이름 : " + p.getName());
				System.out.println("전화번호 : " + p.getPhone());
				System.out.println("이메일 : " + p.getEmail());
				System.out.println("나이 : " + p.getAge());
			}
			
			
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			System.out.println(e.getMessage());
			
		}finally {
			try {
			conn.close();
			st.close();
			result.close();
			} catch(SQLException es) {
				
			}
			
		}


	}

}
