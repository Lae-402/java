package work;

import java.util.Scanner;
import java.util.ArrayList;

public class Q7x6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        ArrayList<Integer> lst = new ArrayList<Integer>();
        int i = 0;
        while ( i==0 ) {
            System.out.print("整数を入力：");
            int num = stdIn.nextInt();
            if ( num==0 ) { break; }
            lst.add(num);
        }

        int sum = 0;
        int ave = 0;
        for ( int j : lst ) {
            sum = sum + j;
        }
        ave = sum / lst.size();

        System.out.println("合計値：" + sum);
        System.out.println("平均値：" + ave);
        
    }
}
