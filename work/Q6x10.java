package work;

import java.util.Scanner;

public class Q6x10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.println("直角三角形を描画します。\n2~20までの整数値を入力してください。");
        System.out.print("底辺の長さを入力：");
        int bottom = stdIn.nextInt();
        if ( bottom >= 2 && bottom <= 20 ) {
            for ( int i=1; i<=bottom; i++ ) {
                for ( int j=1; j<=i; j++ ) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("値が正しくありません");
        }
    }
}
