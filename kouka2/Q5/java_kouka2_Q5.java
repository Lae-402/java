package kouka2.Q5;
import java.util.Scanner;

public class java_kouka2_Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 表示：現在のパスワードの入力を促す
        System.out.print("現在のパスワードを入力してください: ");
        // 変数：pass(String)：ユーザ入力　現在のパスワード
        String password = scanner.nextLine();

        // 表示：セキュリティ状の問題を通知
        System.out.println("セキュリティ上の問題を発見しました。\nこちらをお使い下さい");

        // 表示：新しいパスワード
        System.out.print("あたらしいパスワードは\"");

        // StringBuilderを使用して文字列を逆順にする
        StringBuilder reversePassword = new StringBuilder(password).reverse();

        // 表示：セキュリティ強化後の新規パスワード
        System.out.println( reversePassword.toString() + "\"です。" );
    }
}