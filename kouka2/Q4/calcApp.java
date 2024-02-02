package kouka2.Q4;

import java.util.Scanner;

// 電卓アプリ
public class calcApp implements IFApp {
  Scanner stdIn = new Scanner(System.in);

  // メソッド定義 抽象メソッドのオーバーライド
  // アプリの起動 startUpメソッド
  public void startUp() {
    System.out.println("電卓アプリを起動します！");
    //アプリの本機能である、calcメソッドを呼び出す
    calc();
  }

  // アプリの起動 endメソッド
  public void end() {
    System.out.println("電卓アプリを終了します。");
  }
  // メソッド定義
  // 電卓機能の実装　ココから下は実際に計算する処理が書いてあるだけです。
  //問題を解くうえでは必要ありませんので、読まなくて大丈夫です。
  //早く終わった人は計算の処理を短くできないかチャレンジしてください。
  public void calc(){
    //実際アプリを作るときには、このメソッドの中に機能を実装する
    //今回は簡易的な実装とする
    System.out.print(" 足し算モード:+ \n 引き算モード:- \n 掛け算モード:* \n 割り算モード:/ \n 終了:endと入力して下さい:");
    switch(stdIn.nextLine()){
      case "+":
        plus();
        break;
      case "-":
        minus();
        break;
      case "*":
        multi();
        break;
      case "/":
        div();
        break;
      case "end":
        end();
        return;
      default:
        System.out.println("不明なコマンドです。");
    }
    System.out.println("----------------------------------------------------------------------");
    this.calc();
  }

  //各計算メソッド
  public void plus(){
    System.out.println("足し算モード");
    System.out.print("数字を入力してください：");
    double num1 = Double.parseDouble(stdIn.nextLine());
    System.out.print("数字を入力してください：");
    double num2 = Double.parseDouble(stdIn.nextLine());
    System.out.println(num1+"+"+num2+"="+(num1+num2));
  }

  public void minus(){
    System.out.println("引き算モード");
    System.out.print("数字を入力してください：");
    double num1 = Double.parseDouble(stdIn.nextLine());
    System.out.print("数字を入力してください：");
    double num2 = Double.parseDouble(stdIn.nextLine());
    System.out.println(num1+"-"+num2+"="+(num1-num2));
  }

  public void multi(){
    System.out.println("掛け算モード");
    System.out.print("数字を入力してください：");
    double num1 = Double.parseDouble(stdIn.nextLine());
    System.out.print("数字を入力してください：");
    double num2 = Double.parseDouble(stdIn.nextLine());
    System.out.println(num1+"*"+num2+"="+(num1*num2));
  }

  public void div(){
    System.out.println("割り算モード");
    System.out.print("数字を入力してください：");
    double num1 = Double.parseDouble(stdIn.nextLine());
    System.out.print("数字を入力してください：");
    double num2 = Double.parseDouble(stdIn.nextLine());
    System.out.println(num1+"/"+num2+"="+(num1/num2));
  }
}