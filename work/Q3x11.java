package work;
import java.util.Scanner;

public class Q3x11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.print("文字列１：");
        String moji1 = stdIn.nextLine();
        System.out.print("文字列２：");
        String moji2 = stdIn.nextLine();

        System.out.println(moji2 + moji1);

    }
}
