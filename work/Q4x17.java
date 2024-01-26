package work;

import java.util.Scanner;

public class Q4x17 {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("0~100までの国語の得点（整数値）を入力してください：");
        int jp = stdIn.nextInt();

        int en = 0;
        int ma = 0;

        if ( jp >= 80 ) {
            System.out.print("0~100までの英語の得点（整数値）を入力してください：");
            en = stdIn.nextInt();
        } else {
            System.out.print("0~100までの数学の得点（整数値）を入力してください：");
            ma = stdIn.nextInt();
        }
            
        if ( en >= 80 || ma >= 80 ) {
            System.out.println("合格です");
        } else  {
            System.out.println("不合格です");
        }
    }
}
