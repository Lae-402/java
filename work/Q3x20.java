package work;
import java.util.Scanner;

public class Q3x20 {
            public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);

            System.out.print("ハンバーガー  ：");
            int hamberger = stdIn.nextInt();

            System.out.print("シェイク      ：");
            int shake = stdIn.nextInt();

            System.out.print("コーラ        ：");
            int cora = stdIn.nextInt();

            int sum = ( hamberger+shake+cora );
            System.out.println( "合計額（税抜）：" + sum );

            int tax = (int)( (double)sum * 0.1 );
            System.out.println( "消費税        ：" + tax );

            int chip = (int)( (double)sum * 0.16 );
            System.out.println( "チップ        ：" + chip );

            System.out.println( "合計額（税込）：" + (sum+tax+chip) );
    
        }
    
}
