package day04;
/* 상속을 이용하여 다음 요구사항(중복코드 제거)을 해결하시오.
 * 게임 캐릭터의 초기 작업을 위한 초심자(Novice) 클래스와
 * 초심자의 다음 작업인 마법사(Wizard) 클래스를 다음과 같이 설계했다고 가정 Wizard 클래스가 Novice 클래스의 모든 필드와 메소드를 가지고 있고
 * 추가로 마력 필드 mp와 불 공격 메소드 fireball() 이 더해져 있음
 */
public class Wizard extends Novice {
	int mp;
	
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
		
	}
	
	void fireBall() {
		System.out.printf("%s(HP: %d, MP: %d)의 파이어볼 공격\n" , name, hp, mp);
	}

}

class Knight extends Novice {
	int stamina;
	
	void slash() {
		System.out.printf("%s(HP: %d, MP: %d)의 베기 공격\n" , name, hp, stamina);
	}
}