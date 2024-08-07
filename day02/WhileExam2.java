package day02;

public class WhileExam2 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		while (num < 101) {
			if(num % 2 == 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("0부터 100까지 짝수의 합 : " + sum);

	}

}