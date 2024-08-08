package day03;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		int[] scores = null;
		while(true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택 > ");
			i = sc.nextInt();
			
			if(i==1) {
				System.out.print("학생 수 > ");
				j = sc.nextInt();
				scores = new int[j];
			}
			else if(i == 2) {
				for(int k = 0; k < scores.length; k++) {
					System.out.print("scores[" + k + "] > ");
					int a = sc.nextInt();
					scores[k] = a;
				}
			}
			else if(i ==3) {
				for(int b = 0; b < scores.length; b++) {
					System.out.println("scores[" + b + "] : " + scores[b]);
				}				
			}
			else if (i==4) {
				int max = 0, sum = 0, count = 0;
				
				double avg = 0;
				
				for(int c = 0; c < scores.length; c++) {
					sum += scores[c];
					count++;
					if(scores[c] < max) {
						continue;
					}
					max = scores[c];
				}
				avg = (double) sum/count;
				System.out.println("최고 점수 : " + max + "\n평균 점수 : " + avg);
			}
			else if(i == 5) {
				break;
				}
			}
		
		System.out.println("프로그램 종료");
		}

	}


