package work;
import java.util.Scanner;

public class Q1x9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");
        System.out.print("お名前を入力してください：");
        String name = stdIn.nextLine();

        System.out.println("こんにちは" + name + "さん！");
    }
    
}
