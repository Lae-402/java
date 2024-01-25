package work;

import java.util.Scanner;

public class Q4x7 {
            public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("文字を２つ入力してください");

        System.out.print("１つ目の文字：");
        char char1 = stdIn.next().charAt(0);
        System.out.print("２つ目の文字：");
        char char2 = stdIn.next().charAt(0);

        if ( char1 == char2 )
            System.out.println("同じ文字です");
        else
            System.out.println("異なる文字です");
    }
}
