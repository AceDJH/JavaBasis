package file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author AceDJH
 * @Date 2019/11/24 15:34
 * JDK7前处理
 */
public class HandleException1 {
    public static void main(String[] args) {
// 声明变量
        FileWriter fw = null;
        try {
//创建流对象
            fw = new FileWriter("textTest\\djh.txt");
// 写出数据
            fw.write("异常");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
