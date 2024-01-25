package work;

import java.util.Scanner;

public class Q4x11 {
            public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("数値４桁で西暦を入力してください：");
        int year = stdIn.nextInt();

        if ( (year%4 == 0 && year%100 != 0) || (year%400 == 0) )
            System.out.println("閏年です");
        else
            System.out.println("平年です");
    }
}
