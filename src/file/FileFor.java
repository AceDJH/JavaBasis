package file;

import java.io.File;

/**
 * @Author AceDJH
 * @Date 2019/11/21 16:17
 *  目录的遍历
 */
public class FileFor {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show01(){
        File file = new File("D:\\OpenCv\\opencv");
        String[] strings = file.list();
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void show02(){
        File file = new File("D:\\OpenCv\\opencv");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
