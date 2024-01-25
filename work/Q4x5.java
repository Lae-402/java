package work;
import java.util.Scanner;

public class Q4x5 {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("0~100までの得点（整数値）を入力してください：");
        int socore = stdIn.nextInt();

        if ( socore>=60 )
            System.out.println("合格です");
        else
            System.out.println("不合格です");
    }
}
