package day06;

class Account {
	private int balance;
		
	public int getBalance() {
		return balance;
	}
	
	// 예금, 출금 메소드
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdrwal(int money) throws InsufficientExeption{
		if(balance < money) {
			throw new InsufficientExeption("잔고 부족 : " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}

public class AccountExample {
	

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdrwal(30000);
		}catch (InsufficientExeption e)	{
			String message = e.getMessage();
			System.out.println(message);
			
		}
	}

}
