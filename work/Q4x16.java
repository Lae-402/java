package work;

import java.util.Scanner;

public class Q4x16 {
            public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("0~100までの得点（整数値）を２つ入力してください");

        System.out.print("１つ目の得点：");
        int score1 = stdIn.nextInt();
        System.out.print("２つ目の得点：");
        int score2 = stdIn.nextInt();

        if ( score1 == score2 )
            System.out.println(score1);
        else if ( score1 > score2 )
            System.out.println(score1 + "\n" + score2);
        else
            System.out.println(score2 + "\n" + score1);
    }
}
