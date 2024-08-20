package day10;

import java.sql.*;
import java.io.*;

public class ConnectDB {
	static Connection con = null;
	
	public ConnectDB() {
		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 데이터 베이스 연결
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con = DriverManager.getConnection(url,id,pwd);
			
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	Connection getCon() {
		return con;
	}
}
