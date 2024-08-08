package day03;

public class JobApp {

	public static void main(String[] args) {
		Person hong = new Person();
		hong.age = 20;
		hong.name = "홍길동";
		hong.eat();
		hong.glad();
		
		System.out.println(hong.name + "의 나이는 " + hong.age + "세 입니다.");
		System.out.println(hong.name);
		
		Car car = new Car();
		car.speed = 60;
		car.statement = false;
		car.drivestatement();
		car.speedstate();
		

	}

}
