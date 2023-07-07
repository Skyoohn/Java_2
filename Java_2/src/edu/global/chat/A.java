package edu.global.chat;

import java.net.ServerSocket;
import java.net.Socket;

import edu.global.chat.way.C;
import edu.global.chat.way.D;


public class A {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버가 준비됨");
			
			socket = serverSocket.accept();
			C c = new C(socket);
			D d = new D(socket);
			
			c.start();
			d.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
