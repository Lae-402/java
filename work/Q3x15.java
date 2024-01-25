package work;
import java.util.Scanner;

import java.util.Scanner;

public class Q3x15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("三角形の面積を求めます");
        System.out.print("縦の長さ：");
        int bottom = stdIn.nextInt();
        System.out.print("横の長さ：");
        int height = stdIn.nextInt();
        double area = (bottom * height) / 2;
        System.out.println( "三角形の面積 ＝ " + (area) );

    }
}
