package work.Q15x3;

import java.util.Scanner;

public class Q15x3 {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        try {
            int[] base_list = {1, 2, 3, 4, 5};
            System.out.print("base_list = [");

            for (int i : base_list) {
                System.out.print(i);
                if ( i != base_list[ base_list.length-1 ] )
                    System.out.print(", ");
            }
            System.out.println("]");

            System.out.print("インデックス番号 = ");
            int index = stdIn.nextInt();

            System.out.println("base_list[" + index + "] = " + base_list[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("領域外参照です");
        }
        finally {
            System.out.println("終了");
        }
    }
}
