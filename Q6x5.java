import java.util.Scanner;

public class Q6x5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.print("入力文字列：");
        String moji = stdIn.nextLine();
        String[] lst = moji.split("");
        for ( String i : lst ) {
            System.out.println(i);
        }
    }    
}
