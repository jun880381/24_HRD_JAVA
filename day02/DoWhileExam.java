package day02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String quit = "";
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		System.out.println("메시지를 입력하세요.");
		do {
			System.out.print("> ");
			quit = sc.nextLine();
			System.out.println(quit);
		}while(!quit.equals("q"));
		System.out.println("\n종료!!");
		
	}

}