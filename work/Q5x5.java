package work;

import java.util.Scanner;

public class Q5x5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1～3の値を入力してください：");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("パスポートを提示してください");
                break;
            case 2:
                System.out.println("保険証を提示してください");
                System.out.println("パスポートを提示してください");
                break;
            case 3:
                System.out.println("学生証を提示してください");
                System.out.println("保険証を提示してください");
                System.out.println("パスポートを提示してください");
                break;
            default:
                System.out.println("不正な入力です");
                break;
        }

        scanner.close();
    }
}
