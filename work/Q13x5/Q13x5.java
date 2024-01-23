package work.Q13x5;
import java.util.Scanner;

public class Q13x5 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("１個目の整数を入力してください：");
        int x = stdIn.nextInt();
        System.out.print("２個目の整数を入力してください：");
        int y = stdIn.nextInt();

        CalcExcuter a = new CalcExcuter();
        

        System.out.println( "足し算の結果：" + a.calcAdd(x, y) );
        System.out.println( "引き算の結果：" + a.calcSub(x, y) );
        System.out.println( "掛け算の結果：" + a.calcMulti(x, y) );
        System.out.println( "割り算の結果：" + a.calcDiv(x, y) );
    }

}