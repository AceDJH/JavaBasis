package file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author AceDJH
 * @Date 2019/11/24 15:39
 * JDK7的处理
 * 以使用JDK7优化后的 try-with-resource 语句，该语句确保了每个资源在语句结束时关闭。所谓的资源
 * （resource）是指在程序完成后，必须关闭的对象。
 */
public class HandleException2 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("textTest\\djh1.txt")){
            fileWriter.write("异常2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
