package day04;

import java.util.Scanner;
import java.util.ArrayList;

public class JobApp {
	static Person p1;
	ArrayList<Person> arrList = new ArrayList<Person>();;
	Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		System.out.println("**********JOB v1.1***********");
		System.out.println("******* 1. 구직 등록 ********");
		System.out.println("******* 2. 구인 등록 ********");
		System.out.println("**** 3. 구직자 정보 출력 ****");
		System.out.println("*** 4. 구인회사 정보 출력 ***");
		System.out.println("********** 5. 종료 **********");
		System.out.println("-----------------------------");
		System.out.print("메뉴를 선택 하세요 > ");
	}//showMenu()------------------------------------------------------
	
	public void inputPerson() {
		//Scanner sc = new Scanner(System.in);	
		p1 = new Person();
		System.out.println("\n--구직 등록 시작--");
		System.out.print("이름 입력 > ");
		String name = sc.next();
		p1.name = name;
		System.out.print("나이 입력 > ");
		int age = sc.nextInt();
		p1.age = age;
		boolean run = true;
		while(run) {
			System.out.println("--성별 선택--");
			System.out.println("-- 1. 남성 2. 여성 --");
			int gender = sc.nextInt();
			if (gender == 1) {
				p1.gender = 'M';
				run = false;
			}
			else if (gender == 2) {
				p1.gender = 'F';
				run = false;
			}
			else {
				System.out.println("잘못된 번호 입력");
				System.out.println("1과 2 중에 선택하세요\n");
			}
		}
		System.out.println("전화번호 입력 > ");
		String tellNum = sc.next();
		p1.tellNum = tellNum;
		
		//arrList = new ArrayList<Person>();
		arrList.add(p1);
		
	}

	// 구직자 정보 출력 메소드
	void showInfo() {
		for(Person p : arrList) {
			p.getInfo();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		JobApp job = new JobApp();
		
		boolean stop = false;
		while(!stop) {
			job.showMenu();
			int no = scan.nextInt();
			if(no == 1) {
				job.inputPerson();
			}
			else if(no == 3)  {
				job.showInfo();
			}
			else if(no == 5) {
				stop = true;
			}
		}
		System.out.println("프로그램 종료");
		
		

	}

}
