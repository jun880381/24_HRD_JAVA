package day04;

public class Person {
	
	// 객체 모델링 구성요소(클래스 멤버)
	
	// 속성 : has -a (멤버 변수)  
	int age;
	String name;
	char gender; // 'F', 'M'
	String tellNum;
	
	// 기본 생성자 
	public Person() {
		
	}	
	
	// 메소드 -
	void glad() {
		System.out.println("웃는 중");
	}
	void eat() {
		System.out.println("먹는 중");
	}
	
	void getInfo() {
		System.out.println("\n이름 : " + name + "\n나이 : " + age + "\n성별 : " + gender + "\n전화번호 : " + tellNum);
	}

}
