package test3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {
   
   public static void main(String[] args) {
      try {
         Socket s = new Socket("192.168.0.49",222);
         Scanner scan = new Scanner(System.in);
         System.out.println("할말을 적으세요 : ");
         String sendMsg = scan.nextLine();
         DataOutputStream dos = new DataOutputStream(s.getOutputStream());
         dos.writeUTF(sendMsg);
         DataInputStream dis = new DataInputStream(s.getInputStream());
         String msg = dis.readUTF();
         System.out.println(msg);
      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}