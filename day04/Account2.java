package day04;

import java.util.Scanner;
import java.util.ArrayList;

public class Account2 {
	private String accountNum;
	private String owner;
	private int balance;
	
	Account2 ac;
	Scanner sc = new Scanner(System.in);
	ArrayList<Account2> arrList = new ArrayList<Account2>();
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	void showMenu() {
		System.out.println("-------------------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("-------------------------------------------------------");
	}
	
	void inputAccount() {
		ac = new Account2();
		System.out.println("-------------");
		System.out.println("게좌 생성");
		System.out.println("-------------");
		System.out.println("계좌번호 > ");
		String acNum = sc.nextLine();
		ac.setAccountNum(acNum);
		System.out.println("계좌주 > ");
		String ownerName = sc.nextLine();
		ac.setOwner(ownerName);
		System.out.println("초기 입금액 > ");
		int bal = sc.nextInt();
		ac.setBalance(bal);
		arrList.add(ac);
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
	}
	
	void showAccount() {
		System.out.println("-------------");
		System.out.println("계좌 목록");
		System.out.println("-------------");
		for(Account2 acc : arrList) {
			if(acc != null) {
				System.out.print(acc.getAccountNum());
				System.out.print("\t");
				System.out.print(acc.getOwner());
				System.out.print("\t");
				System.out.print(acc.getBalance());
				System.out.println();
			}
		}
	}
	public void deposit(){
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌 번호 > ");
		String acNum = sc.nextLine();
		if(acNum.equals(this.accountNum)) {
			System.out.print("예금 액 > ");
			int bal = sc.nextInt();
			ac.setBalance(ac.getBalance() + bal);
		}
	}
	void withdrawal() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌 번호 > ");
		String acNum = sc.nextLine();
		System.out.print("예금 액 > ");
		int bal = sc.nextInt();
		ac.setBalance(ac.getBalance() - bal);
		System.out.println("결과 : 출금이 성공되었습니다.");
	}
}
