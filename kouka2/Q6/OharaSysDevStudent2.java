package kouka2.Q6;
 
import java.util.Scanner; 
 
// 大原学園学生クラスを継承した、大原学園 情報処理コース 学生クラスをさらに継承した 大原学園 情報処理 システム開発コース 学生クラスに__(4)__した大原学園 情報処理 システム開発コース 学生クラス2を定義する 
public class OharaSysDevStudent2 extends OharaITStudent implements IFGreeting{ 
  //コース名を追加する 
  //これもみんな同じなので、static final 
  static final String courseName2 = "システム開発コース"; 
  //システム開発演習の科目の点数を管理する変数を追加する 
  int sysDevScore = 0; 
 
  // コンストラクタ 
  public OharaSysDevStudent2(String name,int grade,int javaScore,int sysDevScore){ 
    //親クラスのコンストラクタを呼び出す 
    super(name,grade,javaScore); 
    //システム開発演習の点数を入れる 
    this.sysDevScore = sysDevScore; 
  } 
 
  //javaScoreのセッターとゲッター 
  public void setSysDevScore(int sysDevScore) { 
    this.sysDevScore = sysDevScore; 
  } 
  public int getSysDevScore() { 
    return sysDevScore; 
  } 
 
  //__(5)__
  public void greeting(){ 
    System.out.println("こんにちは、"+this.getGrade()+"年生の"+this.getName()+"です"); 
    System.out.println("コースは"+OharaSysDevStudent2.courseName2+"です"); 
    System.out.println("javaの点数は"+this.getJavaScore()+"で、システム開発演習の点数は、"+this.getSysDevScore()+"です。"); 
  } 
}