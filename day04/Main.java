package day04;

import java.util.*;

public class Main {
	// 클래스 구성 멤버(요소)
	// 1. 필드 : 객체의 데이터를 저장하는 역할(변수)
	// 2. 생성자 : 기본 생성자, 매개변수가 있는 생성자(인자 생성자)  
	// 3. 메소드 : 
	

	public static void main(String[] args) {
		House house = new House("홍길동", 3, "대전광역시");
		house.showOwner(house.ownerName);
		System.out.println(house.showInfo());
		System.out.println("방의 개수는 " + house.getRoomNum() + "개 입니다.");
		//System.out.println(house.show());
		house.showInfo2();
		
		ArrayList<House> arrList = new ArrayList<House>();
		arrList.add(house);
		arrList.add(new House("강길동", 2, "울산광역시"));
		arrList.add(new House("김길동", 73, "부산광역시"));
		
		for(House home : arrList) {
			home.showInfo2();
		}
	}

}

// 집 클래스 모델링(추상화)
class House{
	// has-a 관계
	String ownerName;
	int roomNum;
	String address;
	
	House() {}
	
	House(String ownerName, int roomNum, String address){
		this.ownerName = ownerName;
		this.roomNum = roomNum;
		this.address = address;
	}
	
	// 1. 반환값 없고, 주인 이름을 매개변수로 전달 받아 이름을 같이 출력하는 메소드 showOwner() 정의
	void showOwner(String ownerName) {
		System.out.println("집 주인 이름은 " + ownerName + " 입니다.");
		
	}
	// 2. 방의 갯수를 반환하는 getRoomNum() 메소드 정의
	int getRoomNum() {
		return roomNum;
	}
	// 3. 모든 멤버 변수의 값을 반환하는 showInfo() 메소드 정의
	String showInfo() {
		String result = "주소는 " + address + ", 집 주인 이름은 " +ownerName + ", 방 개수는 " +roomNum + "개 입니다.";
		return result;
	}
	/*String show() {
		return "" + address + ownerName + roomNum;
	}*/
	void showInfo2() {
		System.out.println("주소 : " + address + "\n집 주인 : " + ownerName + "\n방 개수 : " + roomNum);
	}
}