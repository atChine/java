package Exercise;

import java.io.IOException;
import java.net.*;

public class UDPTestSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);

        byte[] data = "hello.明天吃火锅".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.107.1"), 9999);

        socket.send(packet);

        socket.close();
        System.out.println("B发送端退出");
    } 
}
