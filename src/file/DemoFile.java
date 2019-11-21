package file;

import java.io.File;

/**
 * @Author AceDJH
 * @Date 2019/11/21 15:59
 * jdk8中的文档
 * Field Summary
 * Fields
 * Modifier and Type	Field and Description
 * static String	pathSeparator
 * 与系统相关的路径分隔符字符，为方便起见，表示为字符串。
 * static char	pathSeparatorChar
 * 与系统相关的路径分隔符。
 *
 * static String	separator
 * 与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
 * static char	separatorChar
 * 与系统相关的默认名称分隔符。
 */
public class DemoFile {
    public static void main(String[] args) {
        /*
        * 操作路径：路径不能写死了
        * C:\develops\a\a.txt   windows
        * C:/develops/a/a.txt   linux
        * "C:" + File.separator + "develops" + File.separator + "a" + File.separator + "a.txt"
        * */
        System.out.println(File.pathSeparator);//路径分隔符, windows 分号;, linux 冒号:
        System.out.println(File.separator);//文件名称分隔符, windows 反斜杠\, linux 正斜杠/
    }
}
