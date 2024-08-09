package day04;

import java.util.Scanner;

public class BankApplication2 {
	
	

	public static void main(String[] args) {
		Account2 ac = new Account2();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			ac.showMenu();
			int menu = sc.nextInt();
			if(menu == 1) {
				ac.inputAccount();
			}
			else if(menu == 2) {
				ac.showAccount();
			}
			else if(menu == 3) {
				ac.deposit();
			}
			else if(menu == 4) {
				ac.withdrawal();
			}
			else if(menu == 5) {
				run = false;
			}
		}

	}

}
