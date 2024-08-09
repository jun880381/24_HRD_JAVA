package day04;

public class BankApplication {

	public static void main(String[] args) {
			Account account = new Account();
			
			account.setBalance(10000);
			System.out.println("현재 잔고 : " + account.getBalance());
			
			account.setBalance(-100300);
			System.out.println("현재 잔고 : " + account.getBalance());
			
			account.setBalance(1000001);
			System.out.println("현재 잔고 : " + account.getBalance());
			
			
			
		


	}

}
