package kouka2.Q4;

import java.util.Scanner;

public class Kouka4 {
  public static void main(String[] args) {
    //このmainメソッドがスマホ本体の制御をしているイメージ
    //入力されたコマンドによって、起動するアプリを選択する
    Scanner stdIn = new Scanner(System.in);
    // アプリのインスタンスを管理する変数appを宣言する
    IFApp app;
    //ユーザーに起動するアプリを選択してもらう
    System.out.print("起動したいアプリを選択してください:");
    switch(stdIn.nextLine()){
      case "memo":
        //メモアプリのインスタンスを生成する
        app = new memoApp();
        //メモアプリを起動する
        app.startUp();
        break;
      case "calc":
        //電卓アプリのインスタンスを生成する
        app = new calcApp();
        //電卓アプリを起動する
        app.startUp();
        break;
      default:
        System.out.println("そんなアプリは存在しません。");
    }
  }
}
