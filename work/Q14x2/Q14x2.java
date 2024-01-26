package work.Q14x2;

import java.util.Scanner;

public class Q14x2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.print("文字列を入力：");
        String str = stdIn.nextLine();
        System.out.println("入力された文字数は" + str.length() + "です。");
    }
}
