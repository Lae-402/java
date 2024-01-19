package classt.other;

import java.util.*;
public class Sample1_18 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("東京都", "新宿区");
        map.put("千葉県", "千葉市");
        map.put("神奈川県", "横浜市");
        map.put("埼玉県", "さいたま市");

        // キー 存在確認
        System.out.println("東京都：" + map.containsKey("東京都"));

        // 値 存在確認
        System.out.println("東京都：" + map.containsKey("東京都"));

        // キー 削除
        map.remove("埼玉県");
        System.out.println("埼玉県：" + map.containsKey("埼玉県"));

        // キー 置換
        map.replace("神奈川県", "栃木県");
        System.out.println("栃木県：" + map.containsKey("栃木県"));

        // 要素数 確認
        System.out.println("要素数：" + map.size());
    }
}