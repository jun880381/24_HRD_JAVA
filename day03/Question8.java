package day03;

public class Question8 {

	public static void main(String[] args) {
		int[][] array = { {95, 86}, {83, 92, 96},{78,83,93,87,88}};
		
		int sum = 0, count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				count++;
				sum += array[i][j];
			}
		}
		double avg = (double) sum / count;
		System.out.println("array 배열의 최대합 : " + sum + "\narray 배열의 평균 값 : " + avg);

	}

}
