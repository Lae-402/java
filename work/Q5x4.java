package work;

import java.util.Scanner;

public class Q5x4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1～12の値を入力してください：");
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春です");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏です");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋です");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬です");
                break;
            default:
                System.out.println("入力された値が不正です。プログラムを終了します。");
                break;
        }
    }
}
