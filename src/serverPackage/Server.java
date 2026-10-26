package serverPackage;

import java.net.*;

public class Server {

   public static void main(String [] args) throws Exception{

       DatagramSocket socket=new DatagramSocket(1234);
       byte buffer[] =new byte[1024];


           DatagramPacket  paquet=new DatagramPacket(buffer,buffer.length);
           socket.receive(paquet);
           String msg =new String(paquet.getData(),0,paquet.getLength());
           System.out.println(msg+paquet.getAddress()+paquet.getPort());






   }


}
