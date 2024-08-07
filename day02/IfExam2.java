package day02;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("## 메뉴 선택 ##");
		System.out.println("[1] 구매자 [2]판매자");
		System.out.print("## 메뉴를 선택 하세요 -> ");
		i = sc.nextInt();
		if (i == 1) {
			System.out.println("환영합니다! 구매자로 로그인하셨습니다.");
		}
		else if (i == 2) {
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
		}
		

	}

}
