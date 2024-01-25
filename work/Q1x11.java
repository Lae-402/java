package work;
import java.util.Scanner;

public class Q1x11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("年：");
        int year = stdIn.nextInt();
        System.out.print("月：");
        int month = stdIn.nextInt();
        System.out.print("日：");
        int date = stdIn.nextInt();

        System.out.println( year + "/" + month + "/" + date );
    }
}
