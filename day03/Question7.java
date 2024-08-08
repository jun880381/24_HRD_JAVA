package day03;

public class Question7 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2, 21 };
		int max = 0;
		
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] < max ) {
				continue;
			}
			max = array [i];
		}
		System.out.println("array 배열의 최댓값 : " + max);

	}

}
