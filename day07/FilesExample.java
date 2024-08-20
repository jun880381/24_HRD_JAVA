package day07;

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {

	public static void main(String[] args) {
		try {
			String data = "" + "id : winter\n" + "e-mail : winter@mycompany.com\n" + "tel : 010-1234-9876"; 
			
			Path path = Paths.get("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\result.txt");
			
			Files.writeString(Paths.get("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\result.txt"),data,Charset.forName("UTF-8"));
			
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 : " + Files.size(path) + " bytes");
			
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
