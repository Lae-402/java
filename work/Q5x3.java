package work;
import java.util.Scanner;

public class Q5x3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~12の値を入力してください：");
        int month = scanner.nextInt();

        int endDay;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                endDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                endDay = 30;
                break;
            case 2:
                endDay = 28;
                break;
            default:
                System.out.println("無効な月が入力されました。");
                scanner.close();
                return;
        }

        System.out.println(month + "月の末尾は" + endDay + "日です。");
    }
}