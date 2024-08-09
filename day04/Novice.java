package day04;

public class Novice {
	String name;
	int hp;
	
	public Novice() {
		
	}
	
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	void punch() {
		System.out.printf("%s(HP: %d)의 펀치 ! \n", name, hp);
	}

}
