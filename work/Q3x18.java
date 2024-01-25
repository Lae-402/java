package work;

import java.util.Scanner;

public class Q3x18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("税込価格を求めます");
        System.out.print("定価：");
        int base = stdIn.nextInt();
        System.out.print("消費税率：");
        int taxRate = stdIn.nextInt();
        int price = (int)( (double)base + ((double)base*((double)taxRate/100)));
        System.out.println( "定価 ＝ " + base );
        System.out.println( "税率 ＝ " + taxRate );
        System.out.println( "税込価格 ＝ " + price );

    }
}
