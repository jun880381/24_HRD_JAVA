package day05;


/*abstract class Animal {
	// 추상 클래스 : 적어도 한개 이상의 추상 메소드를 갖는 클래스
	// 추상 메소드 : 바디 ({})가 없는 메소드
	
	abstract void sound();	
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("멍멍");		
	}
}

class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("야옹");
	}
} */

interface Soundable{
	public String sound();
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable {
	@Override
	public String sound()	{
		return "멍멍";
	}
}

public class AnimalTest {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		/* Animal animal1 = new Dog();
		Animal animal2 = new Cat();
	
		animal1.sound();
		animal2.sound(); */
		
		printSound(new Cat());
		printSound(new Dog());
		
	}

}
