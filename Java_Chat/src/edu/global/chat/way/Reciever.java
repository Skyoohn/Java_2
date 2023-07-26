package edu.global.chat.way;

import java.io.DataInputStream;
import java.net.Socket;

public class Reciever extends Thread{
		private Socket socket;
		private DataInputStream in;
		
		public Reciever(Socket socket) {
			this.socket=socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {
				
			}
		}
		public void run() {
			while(in != null) {
				try {
					System.out.println(in.readUTF());
				} catch (Exception e) {
				}
			}
		}
		}