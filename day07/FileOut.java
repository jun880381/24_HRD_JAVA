package day07;

import java.io.*;

public class FileOut {
// 키보드 입력 -> 파일 출력
// 파일 이름 : result.txt
	public static void main(String[] args) {
		System.out.println("파일로 저장할 내용을 입력하세요. > ");
		int n = 0;

		try {
			FileOutputStream fos = new FileOutputStream("test.txt", true); // 1. 노드 스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos); // 2. 버퍼 스트림
			FileReader fr = new FileReader("test.txt");
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			
			while ( (n = fr.read()) != -1) {
				osw.write(n);
				osw.flush();
			}
			
			fos.close();
			bos.close();
			
		}catch(FileNotFoundException fd) {
			
		}catch(IOException e) {
			
		}

	}

}
