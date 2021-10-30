package Exercise02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWorkServer {
    public static void main(String[] args) throws Exception {
        //1.监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.等待客户端连接
        Socket socket = serverSocket.accept();
        //3.读取客户端要发送下载的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileNAme = "";
        while ((len = inputStream.read(b)) != -1) {
            downLoadFileNAme += new String(b, 0, len);
        }
        System.out.println("客户端希望下载的文件名为："+downLoadFileNAme);

        String resFileName="";
        if("高山流水".equals(downLoadFileNAme)){
            resFileName="src\\高山流水.mp3";
        }else {
            resFileName="src\\无名.mp3";
        }

        //4.创建一个输入流，读取文件
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(resFileName));
        //5.使用StreamUtils.java ,读取文件到一个数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos =
                new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput();

        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
