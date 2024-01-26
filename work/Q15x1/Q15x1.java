package work.Q15x1;

import java.util.Scanner;

public class Q15x1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        try {
            System.out.print("整数１ = ");
            int num1 = stdIn.nextInt();
            System.out.print("整数２ = ");
            int num2 = stdIn.nextInt();

            System.out.println(num1 + " / " + num2 + " = " + ((double)num1/(double)num2) );
        }
        catch (ArithmeticException e) {
            System.out.println("0による割り算です！！");
        }
        finally {
            System.out.println("処理終了");
        }
    }
}
