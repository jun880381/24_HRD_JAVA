package day07;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ConsoleChatServer implements Runnable {
	private static ServerSocket serverSocket = null;
	static Socket socket = null;
	
	public ConsoleChatServer() throws Exception {
		serverSocket = new ServerSocket(8803);
		
		System.out.println("[서버] 시작됨");
		socket = serverSocket.accept();
		System.out.println("클라이언트 연결 성공");
		
		// 클라이언트에게 메시지 입력 객체
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pout = new PrintWriter(socket.getOutputStream(), true);
		
		// 클라이언트에게 키보드로 메시지 전송
		Thread tr = new Thread(this);
		tr.start();
		String msg = "";
		
		while((msg = key.readLine()) != null) {
			pout.println(msg);
		}
	}

	public static void main(String[] args) throws IOException {
		try {
			new ConsoleChatServer();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String clientMsg = "";
			
			while(true) {
				clientMsg = br.readLine();
				System.out.println("클라이언트 : " + clientMsg);
			}
		} catch (IOException e) {
			System.out.println("예외 : " + e.getMessage());
		}
	}
}
