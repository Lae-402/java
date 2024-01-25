package work;
import java.util.Scanner;

public class Q1x10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");
        System.out.print("文字の入力：");
        String moji = stdIn.nextLine();
        System.out.print("整数の入力：");
        int seisu = stdIn.nextInt();
        System.out.print("小数の入力：");
        double syosu = stdIn.nextDouble();

        System.out.println("入力された文字 ＝ " + moji);
        System.out.println("入力された整数 ＝ " + seisu);
        System.out.println("入力された小数 ＝ " + syosu);
    }
}
