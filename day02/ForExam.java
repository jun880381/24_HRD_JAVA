package day02;

public class ForExam {
	public static void main(String[] args) {
		// for (초기식; 조건식; 증감식) {반복 수행문}
		for(int i = 2; i < 10; i++) {
			System.out.println("## " + i + "단 ##");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
	}

}
