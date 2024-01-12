package work;

import java.util.Scanner;
// java -Dfile.encoding = UTF-8;

class Q1x10{
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.print("文字の入力＞");
        String x = stdIn.next();

        System.out.print("整数の入力＞");
        String y = stdIn.next();

        System.out.print("小数の入力＞");
        String z = stdIn.next();

        System.out.println("入力された文字＝" + x);
        System.out.println("入力された整数＝" + y);
        System.out.println("入力された小数＝" + z);

    }
}