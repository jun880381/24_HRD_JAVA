package day02;

public class ForExam2 {
	public static void main(String[] args) {
		// 0에서 100 까지 짝수들의 총합을 계산하여 출력
		int sum = 0 , sum2 = 0;
		
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
			else if(i % 2 != 0) {
				sum2 += i;
			}
		}
		System.out.println("0에서 100까지 짝수들의 합 : " + sum);
		System.out.println("0에서 100까지 홀수들의 합 : " + sum2);
		
		
	}

}
