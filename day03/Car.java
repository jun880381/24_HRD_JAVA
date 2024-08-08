package day03;

public class Car {
	
	int speed;
	boolean statement;
	
	public Car() {
		
	};
	
	void speedstate() {
		System.out.println("현재 속도 : " + speed);
	}
	
	void drivestatement() {
		if(statement) {
			System.out.println("정지 상태");
		}
		else {
			System.out.println("운전 중");
		}
		
	}

}
