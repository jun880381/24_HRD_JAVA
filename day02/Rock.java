package day02;

import java.util.Scanner;
import java.util.Random;

public class Rock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int i, j = 0;
		System.out.println("종료하려면 0번을 입력하세요");
		do {
			i = ran.nextInt(3)+1;
			System.out.println("컴퓨터 : " + i);
			System.out.println("가위(1) 바위(2) 보(3) 중 하나를 선택하세요.");
			j = sc.nextInt();
			if(i == 1) {
				if(j == 1) {
					System.out.println("무승부");
				}
				else if (j == 2) {
					System.out.println("승리");
				}
				else if(j ==3) {
					System.out.println("패배");
				}
			}
			else if(i == 2) {
				if(j == 1) {
					System.out.println("패배");
				}
				else if (j == 2) {
					System.out.println("무승부");
				}
				else if(j ==3) {
					System.out.println("승리");
				}
			}
			else if(i == 3) {
				if(j == 1) {
					System.out.println("승리");
				}
				else if (j == 2) {
					System.out.println("패배");
				}
				else if(j ==3) {
					System.out.println("무승부");
				}
			}
		}while(j != 0);
		System.out.println("가위바위보 게임 종료");

	}

}
