package work;
import java.util.*;

public class Q8x16 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>(){{ 
            put("id", "100");
            put("name", "大原太郎");
            put("age", "19");
        }};
        map.replace("age", "20");

        for (String key: map.keySet()) {
            System.out.println(key + "：" + map.get(key));
            }

    }
}
