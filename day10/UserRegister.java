package day10;

import java.sql.*;
import java.util.*;

public class UserRegister {
	Connection con = null;
	PreparedStatement ps = null;
	User user = null;
	Scanner sc = null;
	ResultSet rs = null;
	ConnectDB condb = null;
	
	public UserRegister() {
		condb = new ConnectDB();
		con = condb.getCon();
	}
	
	public void Register() {
		int num = 0;
		user = new User();
		
		System.out.println("[회원 가입]");
		System.out.println("아이디 : ");
		user.setUserid(sc.nextLine());
		System.out.println("이름 : ");
		user.setUsername(sc.nextLine());
		System.out.println("비밀번호 : ");
		user.setUserpassword(sc.nextLine());
		System.out.println("나이 : ");
		user.setUserage(sc.nextInt());
		System.out.println("이메일 : ");
		user.setUseremail(sc.nextLine());
		
		try {
		String sql = "INSERT INTO users VALUES(?, ?, ?, ?, ?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getUserid());
		ps.setString(2, user.getUsername());
		ps.setString(3, user.getUserpassword());
		ps.setInt(4, user.getUserage());
		ps.setString(4, user.getUseremail());
		
		num = ps.executeUpdate();
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
}
