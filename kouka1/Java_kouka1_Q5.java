package work;
import java.util.Scanner;

public class Java_kouka1_Q5 {

    // 関数calc_sum：合計点を求める
    // 暫定の合計点sum に 入力値score を加算する
    public static int calc_sum(int sum, int score) {
        sum = sum + score;
        // 結果を返す
        return sum;
    }

    // 関数calc_ave：平均点を計算
    // 合計点を受け取り、入力回数で割る
    public static double calc_ave(int sum) {
        double ave = (double)sum / 5;
        // 結果を返す
        return ave;
    }

    // メイン処理
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;
        int sum = 0;

        // 5回の繰り返し
        for (int i = 1; i <= 5; i++) {

            System.out.print(i + "教科目の点数を入力してください:");
            score = Integer.parseInt(scanner.nextLine());

            if (score >= 0 && score <= 100) {
                // 入力を sum に加算する
                // 関数calc_sumに 現在の合計点sum と 入力値score を渡す
                sum = calc_sum(sum, score);
            } else {
                // 警告文を表示し、合計値は加算せず次に進む
                System.out.println("不正な点数を検知しました。0点とします。");
            }
            
        }

        // 平均点を ave に求める
        // 関数calc_ave に 合計点sum を渡す
        double ave = calc_ave(sum);

        // 合計点・平均点を表示
        System.out.println("合計点 = " + sum);
        System.out.println("平均点 = " + ave);
    }
}
