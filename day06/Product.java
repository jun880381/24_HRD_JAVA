package day06;

public abstract class Product {
	String pname;
	int price;
	
	// 템플릿 메소드 패턴 (메소드 내에 추상메소드를 호출)
	public void printDetail() {
		System.out.print("상품명 : " + pname + ",\t가격 : " + price);
		printExtra();
		System.out.println();
	}
	
	public abstract void printExtra();
	
}
