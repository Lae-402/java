package work;

import java.util.Scanner;
// java -Dfile.encoding = UTF-8;

class Q1x9{
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.print("お名前を入力してください＞");
        String x = stdIn.next();

        System.out.print("こんにちは" + x + "さん！");

    }
}