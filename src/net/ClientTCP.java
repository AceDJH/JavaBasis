package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author AceDJH
 * @Date 2019/12/2 22:57
 */
public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端，发送数据");
        Socket client = new Socket("127.0.0.1", 6666);

        OutputStream outputStream = client.getOutputStream();
        outputStream.write("你好么, 我来了".getBytes());

        InputStream inputStream = client.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));//需要说明长度，不然会将整个数组输出

        inputStream.close();
        outputStream.close();
        client.close();
        System.out.println("客户端关闭");
    }
}
