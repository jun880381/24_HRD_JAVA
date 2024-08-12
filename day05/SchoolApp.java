package day05;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolApp {
	
	
	public static void main(String[] args) {
		Person person;
		ArrayList<Person> personList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		person = new Student("홍길동", 20, "202401", "자바");
		personList.add(person);
		personList.add(new Staff("김사업",30,"201010","HRD사업단"));
		personList.add(new Teacher("김교사",35,"199901","네트워크"));
		
		// person.inputPerson();
		for(Person p : personList) {
			// System.out.println("------------------------------------\n" + p.personInfo());
			// p.printAll();
			if(p instanceof Student) {
				System.out.println("학번 : " + ((Student) p).getId());
			}
			else if(p instanceof Teacher) {
				System.out.println("교번 : " + ((Teacher)p).getId());
			}
			else if(p instanceof Staff) {
				System.out.println("사번 : " + ((Staff)p).getId());
			}
			
		}
	}

}
