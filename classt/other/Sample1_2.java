package classt.other;

import java.util.*;

public class Sample1_2 {

    public static void print(String text, List<Integer> list) {
        System.out.print(text);
        for(int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(0); list.add(1); print("要素を追加：", list);
    
        list.add(1, 2); print("要素を挿入：", list);
        
        list.remove(1); print("要素を削除：", list);
            
        list.set(0,10); print("要素を変更", list);

        int index = list.indexOf(10);
        System.out.println("要素を検索：" + index);

        boolean chk = list.contains(10);
        System.out.println("要素を確認：" + chk);

        int indexNum = list.size();
        System.out.println("要素数：" + indexNum);
    }
}