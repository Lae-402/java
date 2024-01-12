package work;
import java.util.Scanner;

class Q3x14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("長方形の面積を求めます");
        System.out.print("縦の長さ：");
        int vertical = stdIn.nextInt();
        System.out.print("横の長さ：");
        int horizontal = stdIn.nextInt();
        float area = vertical*horizontal;

        System.out.println("長方形の面積＝" + area);
    }
}