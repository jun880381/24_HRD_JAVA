package day05;

interface Vehicle {
	// 추상 메소드
	public void run();
}

class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver {
	void drive(Vehicle v) {
		System.out.println("운전자");
		v.run();
	}
}

public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
	}

}
