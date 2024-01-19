package work;
import java.util.Scanner;

class 名 {

    public static int third(int num) {
        return (num*3);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();

        int th = third(num);
        int ni = third(th);

        System.out.println(num + "の9倍は" + ni + "です");
    }

}