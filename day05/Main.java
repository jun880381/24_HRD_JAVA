package day05;

interface Weapon {
	public void action();
	
}

interface KitchenTool {
	public void action();
	
}

class Bow implements Weapon{
	@Override
	public void action() {
		System.out.println("활 쏘기");
	}
}

class Knife implements KitchenTool, Weapon {
	@Override
	public void action() {
		System.out.println("칼 작동");
	}
}

public class Main {

	public static void main(String[] args) {
		Bow wp1 = new Bow();
		Knife wp2 = new Knife();
		
		wp1.action();
		wp2.action();
		
		Weapon[] weapons = new Weapon[2];
		weapons[0] = wp1;
		weapons[1] = wp2;
		
		for(int i = 0; i < weapons.length; i++) {
			weapons[i].action();
		}
		
	}

}
