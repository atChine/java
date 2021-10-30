package Exercise;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UPDTestServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);

        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        System.out.println("接收端等待接受数据");
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        java.lang.String s = new java.lang.String(data, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("A接收端退出");
    }
}
