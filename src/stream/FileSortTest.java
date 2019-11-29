package stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author AceDJH
 * @Date 2019/11/29 20:26
 * 这种方法只能读取一行，导致当一句话有多行时，排序出现问题
 */
public class FileSortTest {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text\\in.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text\\out.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            list.add(line);
        }
        Collections.sort(list, (o1, o2) -> o1.charAt(0) - o2.charAt(0));
        for (String s : list) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
