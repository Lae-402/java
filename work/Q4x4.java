package work;
import java.util.Scanner;

public class Q4x4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("0~100までの得点（整数値）を２つ入力してください");

        System.out.print("１つ目の得点：");
        int socore1 = stdIn.nextInt();
        System.out.print("２つ目の得点：");
        int score2 = stdIn.nextInt();

        if ( socore1>=80 || score2>=80 )
            System.out.println("合格です");
    }
}
