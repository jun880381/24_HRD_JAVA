package day07;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			System.out.println("보낼 메시지를 입력하세요.");
			String sendMessage = sc.next();
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음 : " + receiveMessage);
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		}catch(Exception e) {
			
		}

	}

}
