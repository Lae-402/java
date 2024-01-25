package work;
import java.util.Scanner;

public class Q3x16 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double PI = 3.14159;

        System.out.println("円の面積を求めます");
        System.out.print("半径：");
        int r = stdIn.nextInt();
        System.out.println( "円の面積 ＝ " + ((r * r) * PI) );

    }
}
