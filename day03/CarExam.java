package day03;

public class CarExam {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		Car2 myCar2 = new Car2("현대","소나타","노랑", 9800);
		Car2 myCar3 = new Car2("롤스로이스","팬텀", "검정");
		myCar.color = "빨강";
		myCar.company = "현대";
		myCar.model = "제네시스 g90";
		myCar.maxSpeed = 9500;
		myCar.CarInfo();
		
		myCar2.CarInfo();
		myCar3.CarInfo();
		
		

	}

}
