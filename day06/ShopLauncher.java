package day06;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop myShop = new MyShop();
		myShop.setTitle("MyShop");
		myShop.genUser();
		myShop.genProduct();
		myShop.start();
	}

}
