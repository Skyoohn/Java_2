package edu.global.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import edu.global.chat.way.Reciever;
import edu.global.chat.way.Sender;

//소스코드를 이해하려고 하지마
public class ChatTcpClient {
	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		
		Socket socket = null;
		
		//포트번호 = 프로그램 번호
		try {
			socket = new Socket(serverIP,8888);
			System.out.println("서버에 연결되었습니다.");
			Sender sender = new Sender(socket);
			Reciever reciever = new Reciever(socket);
			
			sender.start();
			reciever.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
