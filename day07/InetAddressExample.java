package day07;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 아이피 주소 : " + local.getHostAddress());
			
			InetAddress[] locals = InetAddress.getAllByName("www.dju.ac.kr");
			for(InetAddress i : locals) {
				System.out.println(i);
			}
			
		}catch(IOException e) {
			
		}
	}

}
