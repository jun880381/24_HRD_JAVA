package day10;

import java.util.Scanner;
import java.sql.*;

public class BoardExample {
	private Scanner scanner = new Scanner(System.in);
	DataModel dm = null;
	Connection con = null;
	ConnectDB cdb = new ConnectDB();
	UserRegister ur = null;
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("------------------------------------------------------");
		
		try {
			String sql = "SELECT * FROM boards ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Boards boards = new Boards();
				boards.setBno(rs.getInt("bno"));
				boards.setBtitle(rs.getString("btitle"));
				boards.setBwriter(rs.getString("bwriter"));
				boards.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\n", boards.getBno(), boards.getBwriter(), boards.getBdate(), boards.getBtitle());
			}
			
			rs.close();
			ps.close();
		}catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public BoardExample() {
		dm = new DataModel();
		ur = new UserRegister();
	}
	
	public void mainMenu() throws Exception {
		// list();
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit | 5.Register");
		System.out.println("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		System.out.println();
		
		switch(menuNo) {
		case "1" : 
			dm.Create();
			break;
		case "2" : 
			dm.read();
			break;
		case "3" : 
			dm.clear();
			break;
		case "4" : 
			dm.exit();
			break;
		case "5" :
			ur.UserCreate();
			break;
		}
	}
	

	public static void main(String[] args) throws Exception {
		BoardExample be = new BoardExample();
		be.mainMenu();
	}

}
