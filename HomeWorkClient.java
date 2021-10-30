package Exercise02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HomeWorkClient {
    public static void main(String[] args) throws Exception {
      //1，接受用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名");
        String downloadFileName=scanner.next();

        //2.客户端连接服务器，准备发送文件名
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //3.获取和socket关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //设置写入结束的标识
        socket.shutdownOutput(); 

        //4.读取服务器返回的文件(字节数据)
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String filePath="D:\\币安\\"+downloadFileName+".mp3";
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("客户端下载完毕，正在退出");
    }
}
