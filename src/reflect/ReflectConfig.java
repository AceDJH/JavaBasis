package reflect;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author AceDJH
 * @Date 2019/12/18 18:49
 * 反射机制
 * 利用配置文件运行类中的方法
 */
public class ReflectConfig {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 测试用，得到当前文件路径
        // System.out.println(System.getProperty("user.dir"));

        // 加载数据
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("src\\reflect\\config.txt");
        properties.load(fileReader);
        fileReader.close();

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 通过反射来使用
        Class<?> c = Class.forName(className);
        Constructor<?> constructor = c.getConstructor();
        Object object = constructor.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(object);
    }
}
