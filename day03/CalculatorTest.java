package day03;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.x = 150;
		cal.y = 30;
		
		System.out.println("더하기 : " + cal.add(100,40));
		cal.minus(100,40);
		System.out.println("곱하기 : " + cal.multi());
		cal.div();
		
		double result = 10 * 10 * Calculator.pi;
		System.out.println(result);

	}

}
