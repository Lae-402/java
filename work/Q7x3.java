package work;
import java.util.Scanner;

class Q7x3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値を入力：");
        int i = stdIn.nextInt();

        do {
            System.out.print(i % 10);
            i /= 10;
        } while(i > 0);
    }
}