package day07;

// 데이터 소스 : 키보드
// 데이터 목적지 : 모니터
// read() 메소드 사용
// 입력이 종료되면(Ctrl + D, Ctrl + C) -1반환 

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		try {
			int r = 0;
			int count = 0;
			while(true) {
				r = System.in.read(); // 키보드로 입력
//				System.in : InputStream 1바이트 기반스트림
				count ++;
				if(r == 'x' || r == 'X') {
					break;
				}
				System.out.print("r = " + (char)r + "\n");
			}
			
			System.out.println("********************");
			System.out.println(count + " bytes 읽음");
			System.out.println("********************");			
			System.in.close();
			
		} catch(IOException e) {
			e.getMessage();
		}
	}

}
