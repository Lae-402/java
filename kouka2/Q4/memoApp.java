package kouka2.Q4;

import java.util.Scanner;

// メモアプリ
public class memoApp implements IFApp {
  private StringBuilder memo;
  Scanner stdIn = new Scanner(System.in);

  // コンストラクタ定義
  public memoApp() {
    this.memo = new StringBuilder();
  }

  // メソッド定義 抽象メソッドのオーバーライド
  // アプリの起動 startUpメソッド
  public void startUp() {
    System.out.println("メモアプリを起動します！");
    //アプリの本機能である、memoメソッドを呼び出す
    memo();
  }
  // アプリの起動 endメソッド
  public void end() {
    System.out.println("メモアプリを終了します。");
    //memoの中身を初期化する
    memo = new StringBuilder();
  }

  // メソッド定義
  // メモ機能の実装　ココから下は実際にメモをする処理が書いてあるだけです。
  //問題を解くうえでは必要ありませんので、読まなくて大丈夫です。
  public void memo(){
    //実際アプリを作るときには、このメソッドの中に機能を実装する
    //今回は簡易的な実装とする
    System.out.println("メモの内容を書いて、エンターキー \n 終了する場合はendと入力して下さい:");
    String str = stdIn.nextLine();
    if(str.equals("end")){
      this.end();
      return;
    }
    memo.append(str);

    System.out.println("現在のメモの中身は・・・");
    System.out.println(memo.toString());
    this.memo();
  }
}