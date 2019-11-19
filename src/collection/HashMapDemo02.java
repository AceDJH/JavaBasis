package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author AceDJH
 * @Date 2019/11/19 15:47
 */
public class HashMapDemo02 {
    public static void main(String[] args) {
// 创建Map集合对象
        HashMap<String, String> map = new HashMap<String, String>();
// 添加元素到集合
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");
//        再次放入可以修改map中的value
        map.put("胡歌", "刘亦菲");
// 获取 所有的 entry对象 entrySet
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 遍历得到每一个entry对象
        for (Map.Entry<String, String> entry : entrySet) {
            // 解析
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "的CP是:" + value);
        }
    }
}
