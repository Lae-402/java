package kouka2.Q6;

// 大原学園学生クラスを継承した、__(2)__ 大原学園 情報処理 システム開発コース 学生クラスを宣言する 
public class OharaSysDevStudent extends OharaITStudent{ 
  //コース名を追加する 
  //これもみんな同じなので、static final 
  static final String courseName2 = "システム開発コース"; 
  //システム開発演習の科目の点数を管理する変数を追加する 
  int sysDevScore = 0; 
 
  // コンストラクタ 
  public OharaSysDevStudent(String name,int grade,int javaScore,int sysDevScore){ 
    //__(3)__を呼び出す 
    super(name,grade,javaScore); 
    //システム開発演習の点数を入れる 
    this.sysDevScore = sysDevScore; 
  } 
 
  //システム開発演習の点数のセッターとゲッター 
  public void setSysDevScore(int sysDevScore) { 
    this.sysDevScore = sysDevScore; 
  } 
  public int getSysDevScore() { 
    return sysDevScore; 
  } 
} 
 
 
