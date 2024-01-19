package work;
import java.util.*;

class Q8x14 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("野菜　　", "季節");
        map.put("キャベツ", "春");
        map.put("スイカ　", "夏");
        map.put("ナス　　", "秋");
        map.put("ハクサイ", "冬");

    for (String key: map.keySet()) {
        System.out.println(key + "：" + map.get(key));
        }

    }
}