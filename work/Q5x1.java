package work;
import java.util.Scanner;
class Q5x1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("A~Dの値を入力してください：");
        String i = stdIn.next();

        switch(i) {
            case "A" : System.out.print("ランク" + i + "は評価「優」です"); break;
            case "B" : System.out.print("ランク" + i + "は評価「良」です"); break;
            case "C" : System.out.print("ランク" + i + "は評価「可」です"); break;
            case "D" : System.out.print("ランク" + i + "は評価「不可」です"); break;
        }
    }
}