package day02;

import java.util.Arrays;

public class RefType {

	public static void main(String[] args) {
		// 참조형 변수 예제
		RefType ref = new RefType();
		RefType ref2 = new RefType();
		
		if(ref == ref2) {
			System.out.println("동일한 주소를 갖는 객체");
		}
		else if(ref != ref2) {
			System.out.println("서로 다른 주소를 갖는 객체");
		}
		System.out.println(ref == ref2);
		
		String name = new String("가나다라");
		
		System.out.print(name);
		
		String name2 = "마바사아";
		System.out.println(name2);
		
		System.out.println(name2.length());
		
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("score 배열의 총 합 : " + sum);
		
		System.out.println(Arrays.toString(score));
	}

}
