package day02;

public class ContinueExam {

	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			if (i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		int j = 1;
		while (j < 11) {
			j++;
			if(j % 2 != 0) {
				continue;
			}
			System.out.println(j);
		}

	}

}
