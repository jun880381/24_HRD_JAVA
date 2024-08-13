package day06;

import java.io.*;
import java.io.IOException;

/*
 * DataOutputStream : 보조 스트림
 * 자바의 다양한 자료형(Data Type)들을 바이트 단위로 분해하여 쓰기 작업을 한다.
 * DataInputStream과 짝을 이루어 사용한다.
 */
public class DataInOutStream {
	static DataOutputStream dos = null;
	static DataInputStream dis = null;
	
	public static void main(String[] args) {
		try {
			dos = new DataOutputStream(new FileOutputStream("File.txt"));
			dos.writeInt(10);
			dos.writeDouble(155.25);
			dos.writeBoolean(true);
			dos.writeChar('가');
			dos.writeUTF("문자열");
			dos.flush();
			
			dis = new DataInputStream(new FileInputStream("File.txt"));
			
			System.out.println("정수 값 : " + dis.readInt());
			System.out.println("실수 값 : " + dis.readDouble());
			System.out.println("논리 값 : " + dis.readBoolean());
			System.out.println("문자형 : " + dis.readChar());
			System.out.println("문자열 : " + dis.readUTF());
			
			dis.close();
			dos.close();
			
		} catch(Exception e) {
			e.getMessage();		}
	}

}
