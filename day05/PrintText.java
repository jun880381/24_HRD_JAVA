package day05;

public class PrintText implements Printable {

	public static void main(String[] args) {
		PrintText pt = new PrintText();
		Printable pb = new PrintText();
		
		pt.PrintMe();
		pb.PrintMe();
	}

	@Override
	public void PrintMe() {
		System.out.println("텍스트 파일 출력");
		
	}

}
