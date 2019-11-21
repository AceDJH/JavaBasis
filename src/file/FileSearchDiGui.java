package file;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author AceDJH
 * @Date 2019/11/21 16:28
 * 使用递归搜索 F:\DJH研究生\编程\黑马程序员\00 讲义+笔记+资料\Java基础\08.会员版(2.0)-就业课(2.0)-File类与IO流\19.【File类、递归】-笔记\code\08_FileAndRecursion 目录中的 .java 文件。
 */
public class FileSearchDiGui {
    public static void main(String[] args) {
// 创建File对象
        File dir = new File("F:\\DJH研究生\\编程\\黑马程序员\\00 讲义+笔记+资料\\Java基础\\08.会员版(2.0)-就业课(2.0)-File类与IO流\\19.【File类、递归】-笔记\\code\\08_FileAndRecursion");
// 调用打印目录方法
        printDir3(dir);
    }

    public static void printDir(File dir) {
// 获取子文件和目录
        File[] files = dir.listFiles();
// 循环打印
        for (File file : files) {
            if (file.isFile()) {
// 是文件，判断文件名并输出文件绝对路径
                if (file.getName().endsWith(".java")) {
                    System.out.println("文件名:" + file.getAbsolutePath());
                }
            } else {
// 是目录，继续遍历,形成递归
                printDir(file);
            }
        }
    }

    // 使用文件过滤器FileFilter
    public static void printDir2(File dir) {
// 匿名内部类方式,创建过滤器子类对象
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // 如果pathname是一个文件夹也应返回true，以此继续遍历这个文件夹
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });
// 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir2(file);
            }
        }
    }

    public static void printDir3(File dir) {
// lambda的改写
        File[] files = dir.listFiles(f -> f.getName().endsWith(".java") || f.isDirectory());
// 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir3(file);
            }
        }
    }


}
