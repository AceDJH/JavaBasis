package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author AceDJH
 * @Date 2019/11/24 14:31
 * 文件复制：一读一写
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("1.png");
        FileOutputStream fileOutputStream = new FileOutputStream("textTest\\2.jpg");
        /*int len = 0;
        while((len = fileInputStream.read()) != -1){
            fileOutputStream.write(len);
        }*/
        // 使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;// 每次读取的有效字节个数
        while ((len = fileInputStream.read(bytes)) != -1){
            // fileOutputStream.write(bytes, 0, len);
            fileOutputStream.write(bytes);
        }
        // 先关写的，再关读的，如果写完了，肯定读取完毕了
        fileOutputStream.close();
        fileInputStream.close();
    }
}
