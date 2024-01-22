package work;

import java.util.ArrayList;
import java.util.Scanner;

class Q8x3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        ArrayList<Integer> list_even = new ArrayList<Integer>();
        ArrayList<Integer> list_odd = new ArrayList<Integer>();
        int num;

        for(int i=0; i<10; i++) {
           System.out.print((i+1) + "件目：整数を入力 = ");
           num = stdIn.nextInt();

           if (num%2 == 0)
            list_even.add(num);
            else
            list_odd.add(num);
        }

        System.out.println("偶数値配列 = " + list_even);
        System.out.println("奇数値配列 = " + list_odd);

    }
}