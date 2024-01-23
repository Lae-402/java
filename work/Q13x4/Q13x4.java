package work.Q13x4;
import java.util.Scanner;

public class Q13x4 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("１個目の整数を入力してください：");
        int x = stdIn.nextInt();
        System.out.print("２個目の整数を入力してください：");
        int y = stdIn.nextInt();

        CalcExcuter a = new CalcExcuter();
        
        a.dispAdd(x, y);
        a.dispSub(x, y);
        a.dispMulti(x, y);
        a.dispDiv(x, y);
    }

}