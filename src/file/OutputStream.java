package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author AceDJH
 * @Date 2019/11/24 14:08
 */
public class OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("textTest\\a.txt", true);
        for (int i = 0; i < 5; i++) {
            byte[] bytes = "你好哇".getBytes();
            fileOutputStream.write(bytes);
            /*回车符 \r 和换行符 \n ：
            回车符：回到一行的开头（return）。
            换行符：下一行（newline）。
            系统中的换行：
            Windows系统里，每行结尾是 回车+换行 ，即 \r\n ；
            Unix系统里，每行结尾只有 换行 ，即 \n ；
            Mac系统里，每行结尾是 回车 ，即 \r 。从 Mac OS X开始与Linux统一。*/
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
        byte[] bytes = "你好哇".getBytes();
        System.out.println(bytes.length);//9，也就是说3个中文字符占了9个字节，UTF-8一个中文字符3个字节
        System.out.println("a".getBytes().length);//1,英文字符占1个字节
    }
}
