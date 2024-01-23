package kouka1;
import java.util.*;

public class shuto {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("日本", "東京");
        map.put("中国　", "北京");
        map.put("インド", "ニューデリー");
        map.put("イギリス", "ロンドン");
        map.put("アメリカ", "ワシントンD.C.");


        // ゆるせん！！！！！！！！！！！！！！！！！！！！！
        for (String str:map.keySet()) {
            System.out.println(map.get(str));
        }
    }
}
