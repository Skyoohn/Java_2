package edu.global.chat;

import java.net.Socket;

import edu.global.chat.way.C;
import edu.global.chat.way.D;

public class B {

	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		
		Socket socket = null;
		
		try {
			socket = new Socket(serverIP,8888);
			System.out.println("서버에 연결됨");
			C c = new C(socket);
			D d = new D(socket);
			
			c.start();
			d.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
