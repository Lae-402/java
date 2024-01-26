package work.Q14x4;

import java.util.Scanner;

public class Q14x4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.println("文字列を２つ入力してください");
        System.out.print("１つ目の文字列：");
        String str1 = stdIn.nextLine();
        System.out.print("２つ目の文字列：");
        String str2 = stdIn.nextLine();
        
        if ( str1.equals(str2) )
            System.out.println("同じ文字列です。");
        else
            System.out.println("違う文字列です。");
    }
}
