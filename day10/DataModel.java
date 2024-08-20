package day10;

import java.sql.*;
import java.io.*;
import java.util.*;
import java.util.Date;

public class DataModel {
	// 1. 데이터 베이스 연결
	// 2. 데이터 입출력 담당 메소드 구현
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	ConnectDB cdb = null;
	Boards boards = null;
	Scanner sc = new Scanner(System.in);
	public DataModel() {
		cdb = new ConnectDB();
		con = cdb.getCon();
//		if(con != null) {
//			System.out.println("DB 연결 성공");
//		}else {
//			System.out.println("DB 연결 실패");
//		}
		sc = new Scanner(System.in);
	}
	
	// 데이터 추가 메소드 InsertData() (INSERT INTO ~ )
	public void InsertData(Boards boards) throws SQLException{
		int num = 0;
		this.boards = boards;
		
		String sql = "INSERT INTO boards (btitle, bcontent, bwriter, bdate) VALUES (?, ?, ?, now())";
		ps = con.prepareStatement(sql);
		ps.setString(1, boards.getBtitle());
		ps.setString(2, boards.getBcontent());
		ps.setString(3, boards.getBwriter());
		
		num = ps.executeUpdate();
		
		if(num > 0) {
			System.out.println("저장 성공");
		}else {
			System.out.println("저장 실패");
		}
	}
	
	public void Create() throws Exception {
		
		Boards boards = new Boards();
		System.out.println("[새 개시물 입력]");
		System.out.println("제목 : ");
		boards.setBtitle(sc.nextLine());
		System.out.println("내용 : ");
		boards.setBcontent(sc.nextLine());
		System.out.println("작성자 : ");
		boards.setBwriter(sc.nextLine());
		
		InsertData(boards);
		
		BoardExample be = new BoardExample();
		be.mainMenu();
	}
	
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
			System.out.println("------------------------------------------------");
			
			rs.close();
			ps.close();
		}catch(SQLException e) {
			e.getMessage();
		}
	}
	
	// 데이터 검색 List()
//	public void List() {
//		String sql = "SELECT * FROM boards WHERE bfilename = ? ORDER BY bno DESC";
//		try {
//			sc = new Scanner(System.in);
//			ps = con.prepareStatement(sql);
//			System.out.println("제목 검색 : ");
//			ps.setString(1, sc.nextLine());
//	
//			rs = ps.executeQuery();
//			ArrayList<Boards> arrlist = new ArrayList<Boards>();
//			
//			System.out.println("[게시글 목록]");
//			
//			while(rs.next()) {
//				Boards boards = new Boards();
//				boards.setBno(rs.getInt("bno"));
//				boards.setBtitle(rs.getString("btitle"));
//				boards.setBcontent(rs.getString("bcontent"));
//				boards.setBwriter(rs.getString("bwriter"));
//				boards.setBdate(rs.getDate("bdate"));
//				int bno = rs.getInt("bno");
//				String btitle = rs.getString("btitle");
//				String bcontent = rs.getString("bcontent");
//				String bwriter = rs.getString("bwriter");
//				Date bdate = rs.getDate("bdate");
//				
//				boards = new Boards(bno, btitle, bcontent, bwriter, bdate);
//				arrlist.add(boards);
//				
//				System.out.println("-----------------------------------");
//				System.out.println("번호 : " + boards.getBno());
//				System.out.println("제목 : " + boards.getBtitle());
//				System.out.println("내용 : " + boards.getBcontent());
//				System.out.println("작성자 : " + boards.getBwriter());
//				System.out.println("작성시간 : " + boards.getBdate());
//			}
//			
//			for(Boards b : arrlist) {
//				System.out.println("-----------------------------------");
//				System.out.println("번호 : " + b.getBno());
//				System.out.println("제목 : " + b.getBtitle());
//				System.out.println("내용 : " + b.getBcontent());
//				System.out.println("작성자 : " + b.getBwriter());
//				System.out.println("작성시간 : " + b.getBdate());
//			}
//			
//			rs.close();
//			ps.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	// 게시물 릭기 메소드 구현하기 bno를 입력받아서 해당 게시물을 읽어오기
	public void read() {
		System.out.println("[게시물 읽기]");
		list();
		System.out.println("게시물 번호 : ");
//		int bno = Integer.parseInt(sc.nextLine());
		int bno = sc.nextInt();
		
		try {
			String sql = "SELECT * FROM boards WHERE bno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				boards = new Boards();
				boards.setBno(rs.getInt("bno"));
				boards.setBtitle(rs.getString("btitle"));
				boards.setBcontent(rs.getString("bcontent"));
				boards.setBwriter(rs.getString("bwriter"));
				boards.setBdate(rs.getDate("bdate"));
				System.out.println("-----------------------------------");
				System.out.println("번호 : " + boards.getBno());
				System.out.println("제목 : " + boards.getBtitle());
				System.out.println("내용 : " + boards.getBcontent());
				System.out.println("작성자 : " + boards.getBwriter());
				System.out.println("작성시간 : " + boards.getBdate());
				System.out.println("------------------------------------------");
				System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
				System.out.println("메뉴 선택 : ");
				
				int menuNo = sc.nextInt();

				if(menuNo==1) {
					update(boards);
				}else if(menuNo==2) {
					delete(boards);
				}else if(menuNo==3) {
					BoardExample be = new BoardExample();
					be.mainMenu();
				}
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public void update(Boards boards) {
		System.out.println("[수정 내용 입력]");
		System.out.println("제목 : ");
		boards.setBtitle(sc.nextLine());
		boards.setBtitle(sc.nextLine());
		System.out.println("내용 : ");
		boards.setBcontent(sc.nextLine());
		System.out.println("작성자 : ");
		boards.setBwriter(sc.nextLine());
		
		System.out.println("-----------------------------------------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
		System.out.println("보조 메뉴 선택 :");
		int menuNo = sc.nextInt();
		
		if(menuNo == 1) {
			try {
				String sql = "UPDATE boards SET btitle = ?, bcontent = ?, bwriter = ? WHERE bno = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, boards.getBtitle());
				ps.setString(2, boards.getBcontent());
				ps.setString(3, boards.getBwriter());
				ps.setInt(4, boards.getBno());
				ps.executeUpdate();
				ps.close();
				con.close();
				
				BoardExample be = new BoardExample();
				be.mainMenu();
			}catch(Exception e) {
				e.getMessage();
			}
		}else if(menuNo == 2){
			try {
				System.out.println("게시물 수정 취소");
				BoardExample be = new BoardExample();
				be.mainMenu();
			}catch(Exception e) {
				e.getMessage();
			}
		}
	}
	
	public void delete(Boards boards) throws Exception {
		try {
			String sql = "DELETE FROM boards WHERE bno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, boards.getBno());
			ps.executeUpdate();
			ps.close();
			con.close();
			
			System.out.println(boards.getBno() + "번 게시물 삭제");
		}catch(Exception e) {
			e.getMessage();
		}
		BoardExample be = new BoardExample();
		be.mainMenu();
	}
	
	public void clear() throws Exception {
		System.out.println("[게시글 전체 삭제]");
		System.out.println("-------------------------------------");
		System.out.println("보조메뉴 : 1.OK | 2.Cancel");
		System.out.println("메뉴 선택 : ");
		int menuNo = sc.nextInt();
		
		if(menuNo == 1) {
			try {
				String sql = "TRUNCATE TABLE boards";
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				ps.close();
			}catch(Exception e) {
				e.getMessage();
			}
		}else if(menuNo == 2) {
			BoardExample be = new BoardExample();
			be.mainMenu();
		}
	}
	
	public void exit() {
		if(con != null) {
			try {
				con.close();
			}catch(Exception e) {
				
			}
		}
		System.out.println("게시판 종료");
		System.exit(0);
	}
	
	public static void main(String[] args) throws SQLException {
		DataModel dm = new DataModel();
//		dm.Create();
		// dm.List();
		dm.read();
	}

}
