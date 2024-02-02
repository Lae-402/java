package work;
import java.util.Random;
import java.util.Collections;

public class Q8x4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] lst = new int[10];

        int sum = 0;
        int max = 0;
        for ( int i=0; i<10; i++ ) {
            int ran = rand.nextInt(100);
            lst[i] = ran;
            sum = sum + ran;
            if ( lst[i] > max ) {
                max = lst[i];
            }
        }

        System.out.println("合計値は" + sum + "です。");
        System.out.println("最大値は" + max + "です。");

        for ( int j=0; j<10; j++ ) {
            System.out.println("配列[" + j + "]：" + lst[j] );
        }
    }
}
