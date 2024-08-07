package day02;

public class Game369 {

	public static void main(String[] args) {
		// 369 게임
		int i;
		String clap = " 짝";
		for (i = 1; i < 11; i++) {
			if((i == 3) || (i == 6) || (i == 9)) {
				System.out.print(clap);
				continue;
			}
			System.out.print(" " + i);
		}

	}

}
