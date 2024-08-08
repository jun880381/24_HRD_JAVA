package day03;

public class Car2 {
	
	String company, model, color;
	int maxSpeed, rpm, speed;

	public Car2() {
		
	}
	// 인자 생성자 (오버로딩)
	public Car2(String company, String model, String color, int maxSpeed) {
		this.color = color;
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	public Car2(String company, String model, String color) {
		this(company, model, color,200);
		
	}
	
	
	
	
	void CarInfo() {
		System.out.println("--------------");
		System.out.println("제조 회사 : " + company);
		System.out.println("모델 명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("최고 속도 : " + maxSpeed + "km");
	}
	
}
