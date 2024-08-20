package day10;

import java.sql.*;
import java.util.*;

public class UserRegister {
	Connection con = null;
	PreparedStatement ps = null;
	User user = null;
	Scanner sc = new Scanner(System.in);
	ResultSet rs = null;
	ConnectDB condb = null;
	
	public UserRegister() {
		condb = new ConnectDB();
		con = condb.getCon();
	}
	
	public void Register(User user) throws SQLException {
		int num = 0;
		this.user = user;

		String sql = "INSERT INTO users VALUES(?, ?, ?, ?, ?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getUserid());
		ps.setString(2, user.getUsername());
		ps.setString(3, user.getUserpassword());
		ps.setInt(4, user.getUserage());
		ps.setString(5, user.getUseremail());
		
		num = ps.executeUpdate();
				
		if(num > 0) {
			System.out.println("회원 가입 성공");
		}else {
			System.out.println("회원 가입 실패");
		}
	}
	
	public void UserCreate() throws Exception {
		user = new User();
		
		System.out.println("[회원 가입]");
		System.out.println("아이디 : ");
		user.setUserid(sc.nextLine());
		System.out.println("이름 : ");
		user.setUsername(sc.nextLine());
		System.out.println("비밀번호 : ");
		user.setUserpassword(sc.nextLine());
		System.out.println("이메일 : ");
		user.setUseremail(sc.nextLine());
		System.out.println("나이 : ");
		user.setUserage(sc.nextInt());
		
		Register(user);
		
		BoardExample be = new BoardExample();
		be.mainMenu();
	}
}
