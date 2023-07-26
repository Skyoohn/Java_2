package edu.global.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import edu.global.chat.way.Reciever;
import edu.global.chat.way.Sender;

//소스코드를 이해하려고 하지마
public class ChatTcpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		Socket socket = null;
		
		//포트번호 = 프로그램 번호
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버가 준비되었습니다.");
			
			socket = serverSocket.accept();
//			System.out.println("연결 되었습니다." + socket.getInetAddress().getHostName());
			Sender sender = new Sender(socket);
			Reciever reciever = new Reciever(socket);
			
			sender.start();
			reciever.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
