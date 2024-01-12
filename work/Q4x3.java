package work;
import java.util.Scanner;
class Q4x3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("0~100までの得点（整数値）を２つ入力してください");
        System.out.print("国語の得点：");
        int ja = stdIn.nextInt();
        System.out.print("英語の得点：");
        int en = stdIn.nextInt();

        if (ja >= 80 && en >= 80)
            System.out.println("2科目とも合格です");
    }
}