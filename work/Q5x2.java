package work;
import java.util.Scanner;
class Q5x2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("クラス番号（1~3）の値を入力してください：");
        String i = stdIn.next();

        switch(i) {
            case "1" : System.out.print("情報処理コース"); break;
            case "2" : System.out.print("OAビジネスコース"); break;
            case "3" : System.out.print("税理士コース"); break;
            default : System.out.print("不正な入力です"); break;
        }
    }
}