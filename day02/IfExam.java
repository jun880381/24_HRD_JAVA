package day02;

import java.util.Scanner;

public class IfExam	 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 50;
		String hakjum = "";
		System.out.println("점수를 입력하세요. : ");
		score = sc.nextInt();
		
		if (score >= 95) {
			hakjum = "A+";
		}
		else if (score >= 90) {
			hakjum = "A";
		}
		else if (score >= 85) {
			hakjum = "B+";
		}
		else if (score >=80 ) {
			hakjum = "B";
		}
		else if (score >= 75) {
			hakjum = "C+";
		}
		else if (score >= 70) {
			hakjum = "C";
		}
		else if (score >= 65) {
			hakjum = "D+";
		}
		else if (score >= 60) {
			hakjum = "D";
		}
		else{
			hakjum = "F";
		}
		
		System.out.println(hakjum);
	}

}
