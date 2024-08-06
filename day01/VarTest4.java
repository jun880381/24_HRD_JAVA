package day01;
import java.util.Scanner;

public class VarTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출생 연도를 입력하세요.");
		int year = sc.nextInt();
		
		System.out.print("나이 계산 방식을 입력하세요.");
		String age_type = sc.next();
		int answer = 0;
		
		if(age_type .equals("Korea")) {
			answer = 2030 - year + 1;
		}
		else if (age_type.equals("Year")) {
			answer = 2030 - year;
		}
		
		System.out.println(answer);
	}

}
