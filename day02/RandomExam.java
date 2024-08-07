package day02;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		// 임의의 수의 생성과 수를 다루는 내장 객체 -> Random 클래스
		// 참조형 변수 선언으로 생성한다.
		Random random = new Random();
		
		// 1 ~ 5 까지의 수 생성
		
		for(int i = 1; i<7; i++) {
			int num = random.nextInt(45)+1;
			System.out.println(num);
		}
		
		
	}

}
