package day07;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ConsoleChatClient implements Runnable{
	private static ServerSocket serverSocket = null;
	static Socket socket = null;
	static Thread tr = null;
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8803);
			System.out.println("클라이언트 연결 됨");
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String serverMsg = "";
			
			while(true) {
				serverMsg = br.readLine();
				System.out.println("서버 : " + serverMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		try {
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter pout = new PrintWriter(socket.getOutputStream(),true);
			
			tr = new Thread(this);
			tr.start();
			String msg = "";
			
			while((msg = key.readLine()) != null) {
				pout.println(msg);
			}
			
		}catch(IOException e) {
			System.out.println("에러 : " + e.getMessage());
			
		}
	}

}
