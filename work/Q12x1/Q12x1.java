package work.Q12x1;
import java.util.Scanner;

public class Q12x1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください：");
        int x = scanner.nextInt();
        System.out.print("整数を入力してください：");
        int y = scanner.nextInt();

        MoreCalc a = new MoreCalc();

        System.out.println("Sum " + x + " amd " + y + " = " + a.calcSum(x,y));
        System.out.println("Average " + x + " and " + y + " = " + a.calcAve(x,y));
        System.out.println("Power " + x + " of " + y + " = " + a.calcPow(x,y));
    }
}