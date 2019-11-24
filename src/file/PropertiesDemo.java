package file;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @Author AceDJH
 * @Date 2019/11/24 16:40
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        proStore();
        proLoad();
    }

    private static void proStore() throws IOException {
        System.out.println("Store------");
        Properties properties = new Properties();
        properties.setProperty("filename", "text\\a.text");//在文件中这样存储filename=text\\a.text
        properties.setProperty("length", "209385038");
        properties.setProperty("author", "DJ作者");
        System.out.println(properties);

        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            System.out.println(key + "---" + properties.getProperty(key));
        }

        FileWriter fileWriter = new FileWriter("text\\prop.txt");
        properties.store(fileWriter, "save data");
        fileWriter.close();
    }

    private static void proLoad() throws IOException {
        System.out.println("Load------");
        Properties properties = new Properties();
        // 文本中的数据，必须是键值对形式，可以使用空格、等号、冒号等符号分隔。
        properties.load(new FileReader("text\\prop1.txt"));
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            System.out.println(key + "---" + properties.getProperty(key));
        }
    }
}
