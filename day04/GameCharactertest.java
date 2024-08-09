package day04;
/* 상속을 이용하여 다음 요구사항(중복코드 제거)을 해결하시오.
 * 게임 캐릭터의 초기 작업을 위한 초심자(Novice) 클래스와
 * 초심자의 다음 작업인 마법사(Wizard) 클래스를 다음과 같이 설계했다고 가정 Wizard 클래스가 Novice 클래스의 모든 필드와 메소드를 가지고 있고
 * 추가로 마력 필드 mp와 불 공격 메소드 fireball() 이 더해져 있음
 */

import java.util.ArrayList;

public class GameCharactertest {

	public static void main(String[] args) {
		Wizard wizard = new Wizard("hong", 20, 40);
		
		wizard.fireBall();
		wizard.punch();
		
		ArrayList<Novice> charList = new ArrayList<Novice>();
		charList.add(wizard);
		
		for(Novice n : charList) {
			if(n instanceof Wizard) {
				((Wizard) n).fireBall();
			}
			else if(n instanceof Knight) {
				((Knight) n).slash();
				
			}
		}

	}

}
