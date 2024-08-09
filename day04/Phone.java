package day04;

public class Phone {
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("부모 클래스 생성자 실행");
	}
	
	
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
