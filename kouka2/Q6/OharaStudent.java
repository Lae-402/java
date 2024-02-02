package kouka2.Q6;
 
// 大原学園の学生クラス 
public class OharaStudent { 
  private String name; // 名前 
  private int grade; // 学年 
  static final String schoolName= "大原学園"; // 学校名 全員変わらないのでstatic final 
 
  // コンストラクタ 
  public OharaStudent(String name,int grade){ 
    this.name = name; 
    this.grade = grade; 
  } 
 
  //セッターとゲッターを定義 
  public void setGrade(int grade) { 
    this.grade = grade; 
  } 
  public void setName(String name) { 
    this.name = name; 
  } 
  public int getGrade() { 
    return grade; 
  } 
  public String getName() { 
    return name; 
  } 
} 