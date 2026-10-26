package clientPackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {


   public static void main(String []args) throws Exception{
       DatagramSocket socket=new DatagramSocket();
       Scanner sc =new Scanner(System.in);
       String nom= sc.nextLine();
       String msg=nom+"bonjour";
       byte buffer[] =msg.getBytes();
       int length=buffer.length;
       DatagramPacket paquet=new DatagramPacket(buffer,length,InetAddress.getByName("localhost"),1234);
       socket.send(paquet);
   }


}
