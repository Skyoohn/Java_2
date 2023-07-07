package edu.global.chat.way;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C extends Thread {
	private Socket socket;
	private DataOutputStream out;
	private String name;
	
	public C(Socket socket) {
		this.socket=socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress()+":"+socket.getPort()+"]";
		} catch (Exception e) {
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + sc.nextLine());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
