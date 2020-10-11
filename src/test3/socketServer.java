package test3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class socketServer {
		
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(222);
			for(;;) {
				Socket s = ss.accept();
				System.out.println(s.getInetAddress()+"로 접속이 생성되었습니다.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
