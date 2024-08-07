package day02;

import java.util.Scanner;

public class IfExam3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		String id;
		
		System.out.println("## 로그인 (admin 혹은 임의의 아이디) ##");
		System.out.print("# 로그인 아이디 : ");
		id = sc.next();
		
		if (id.equals("admin")) {
			System.out.println(id + "로그인!!");
		}
		else {
			System.out.println(id + "로그인!!");
		}
		
		System.out.println("## 메뉴를 선택 하세요 (1~2) ##");
		System.out.print("# 메뉴 선택 : ");
		i = sc.nextInt();
		
		if(i == 1) {
			System.out.println(id + " " + i + "번 선택함");
		}
		else if (i == 2) {
			System.out.println(id + " " + i + "번 선택함");
		}
		
	}

}
