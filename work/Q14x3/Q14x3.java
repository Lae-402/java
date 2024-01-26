package work.Q14x3;

import java.util.Scanner;

public class Q14x3 {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        StringBuilder s1 = new StringBuilder(10);

        System.out.print("文字列を入力：");
        String str = stdIn.nextLine();
        s1.append(str);

        s1.delete(10, str.length());

        System.out.println("結果文字列：" + s1);
    }
}
