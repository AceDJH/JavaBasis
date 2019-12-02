package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author AceDJH
 * @Date 2019/12/2 23:02
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动，等待连接...");
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket server = serverSocket.accept();

        InputStream inputStream = server.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        OutputStream outputStream = server.getOutputStream();
        outputStream.write("服务器我很好".getBytes());

        outputStream.close();
        inputStream.close();
        server.close();
        // serverSocket.close();
        System.out.println("服务器关闭");

    }
}
