package work;

import java.util.Scanner;

public class Q4x6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値を入力してください：");
        int num = stdIn.nextInt();

        if ( num%2 == 1 || num%2 == -1 )
            System.out.println("奇数です");
        else
            System.out.println("偶数です");
    }
}
