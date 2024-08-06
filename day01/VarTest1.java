package day01;
// Scanner 참조
import java.util.Scanner;

public class VarTest1 {

	public static void main(String[] args) {
		// 참조형 변수 사용시 new 사용
		Scanner scanner = new Scanner(System.in);
		
		
		// 1. 정수 변수
		int x;
		
		// 변수 초기화
		x = 5;
		System.out.println("첫 번째 정수 입력 : ");
		x = scanner.nextInt();
		
		int y = 8;
		System.out.println("두 번째 정수 입력 : ");
		y = scanner.nextInt();
		
		int result = x + y;
		
		System.out.println(result);
		
		// 2. 실수 변수
		// float(4byte), double(8byte)
		double height = 155.7;
		System.out.print("키 입력 : ");
		height = scanner.nextDouble();
		
		float weight = 44.5f;
		System.out.print("몸무게 입력 : ");
		weight = scanner.nextFloat();
		
		
		// 3. 문자형 변수
		// char
		char blood = 'A';
		
		
		// 4. 문자열 변수
		// String
		String name = "염희균";
		System.out.print("이름을 입력하시오 : ");
		name = scanner.next();
		
		
		
		System.out.print("키 : " + height + "\n몸무게 : " + weight + "\n");
		System.out.println("혈액형은 " + blood + "형 입니다.");
		System.out.println("이름은 "+ name + " 입니다.");
		
		// 5. 논리형 변수
		// boolean 형
		boolean stop = false;
		
		if (stop == true) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}

	}

}
