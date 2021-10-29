package Exercise03;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Server {
    @Test
    public void SocketTCP02Server() throws IOException {

        System.out.println("服务器启动，ip端口为"+ InetAddress.getLocalHost());
        ServerSocket serverSocket= new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        while (true) {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String s = bufferedReader.readLine();
            System.out.println(s);

            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("宝塔镇河妖");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
