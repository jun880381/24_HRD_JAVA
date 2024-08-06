package day01;
import java.util.Scanner;
/*
 * 4칙 연산과 나머지 연산을 하는 간단한 계산기 예제
 */
public class VarTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 4칙 연산을 입력 받아 저장하는 변수 선언
		System.out.println("연산자를 입력하세요.");
		String math = sc.next();
		
		// 2. 2개 정수 입력 받아 저장하는 변수 선언
		System.out.println("정수 2개를 입력하세요.");
		int i = sc.nextInt();
		int j = sc.nextInt();		
		
		// 3. 더하기면 덧셈, 빼기면 뺄셈
		int result = 0;
		if (math.equals("+")) {
			result = i+j;
		}
		else if (math.equals("-")) {
			result = i-j;
		}
		else if (math.equals("*")) {
			result = i*j;
		}
		else if (math.equals("/")) {
			result = i/j;
		}
		else if (math.equals("%")) {
			result = i%j;
		}
		
		
		// 4. 결과값 출력
		System.out.println(i + " " + math + " " + j +  " = " + result);

	}

}
