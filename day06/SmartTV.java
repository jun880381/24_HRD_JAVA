package day06;

public class SmartTV extends Product{
	String resolution;
	
	SmartTV(String pname, int price, String resolution){
		super.pname = pname;
		super.price = price;
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.print(",\t해상도 : " + resolution);
	}

}
