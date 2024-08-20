package day09;
/*
 *  1. JDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 *  
 */

import java.sql.*;
import java.io.*;

public class BoardsSelectExample {

	public static void main(String[] args) {
		Connection conn = null;
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
			
			String sql2 = "SELECT * FROM boards WHERE bwriter = ?"; 
			PreparedStatement st = conn.prepareStatement(sql2);
			
			st.setString(1, "winter");
			// 4. 데이터 추가 명령 전송 하기 executeUpdate()
			ResultSet result = st.executeQuery();
			
			while(result.next()) {
				String btitle = result.getString("btitle");
				String bcontent = result.getString("bcontent");
				String bwriter = result.getString("bwriter");
				String bdate = result.getDate("bdate").toString();
				String bfilename = result.getString("bfilename");
				// String bfiledata = null;
				
				Blob blob = result.getBlob("bfiledata");
				InputStream is = blob.getBinaryStream();
				OutputStream os = new FileOutputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\snow1.jpg");
				
				is.transferTo(os);
				
				System.out.println("제목 : " + btitle);
				System.out.println("내용 : " + bcontent);
				System.out.println("작성자 : " + bwriter);
				System.out.println("작성 시간 : " + bdate);
				System.out.println("사진 이름 : " + bfilename);
//				System.out.println("사진경로 : " + bfiledata);
				os.flush();
				os.close();
				is.close();
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
