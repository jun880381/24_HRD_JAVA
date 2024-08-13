package day06;

public class CellPhone extends Product{
	String carrier;
	
	public CellPhone(String pname, int price, String carrier){
		super.pname = pname;
		super.price = price;
		this.carrier = carrier;
	}
	
	@Override
	public void printExtra() {
		System.out.print(",\t통신사 : " + carrier);
	}

}
