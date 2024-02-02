package kouka2.Q6;
 
// __(1)__、大原学園 情報処理コース 学生クラスを宣言する 
public class OharaITStudent extends OharaStudent{ 
  //コース名を追加する 
  //これもみんな同じなので、static final 
  static final String courseName = "情報処理コース"; 
  //Javaの科目の点数を管理する変数を追加する 
  int javaScore = 0; 
 
  // コンストラクタ 
  public OharaITStudent(String name,int grade,int javaScore){ 
    //親クラスのコンストラクタを呼び出す 
    super(name,grade); 
    //Javaの点数を入れる 
    this.javaScore = javaScore; 
  } 
 
  //javaScoreのセッターとゲッター 
  public void setJavaScore(int javaScore) { 
    this.javaScore = javaScore; 
  } 
  public int getJavaScore() { 
    return javaScore; 
  } 
}