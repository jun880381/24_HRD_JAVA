package day02;

public class WhileExam {

	public static void main(String[] args) {
		int num = 20;
		while (num > 10) {
			System.out.println(num);
			num--;
		}
		boolean flag = true;
		while (flag) {
			num--;
			if(num == 3) {
				flag = false;
			}
		}
		System.out.println("프로그램 종료 num = " + num);

	}

}
