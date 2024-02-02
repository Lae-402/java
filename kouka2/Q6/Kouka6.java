package kouka2.Q6;

import java.util.Scanner; 
 
public class Kouka6 { 
  public static void main(String[] args) { 
    //大原学生クラスのインスタンスを生成する 
    OharaStudent stu1 = new OharaStudent("大原太郎", 1); 
 
    //この学生のデータを表示する 
    //お名前　ゲッターで呼び出す 
    System.out.println("お名前：" + stu1.getName()); 
    //学校名　__(6)__で呼び出せる 
    System.out.println("学校名：" + OharaStudent.schoolName); 
    //学年　ゲッターで呼び出す 
    System.out.println("学年　:" + stu1.getGrade() + "年"); 
 
    System.out.println("//-------------------------------------------------------------------------------//"); 
 
    Scanner stdIn = new Scanner(System.in); 
    //今度は、ユーザに入力して貰った情報を元に大原学生インスタンスを生成する 
    //__(7)__の行でException発生の可能性があるので、例外処理を行う 
    try{ 
      //名前の入力 
      System.out.print("お名前を入力してください："); 
      String name = stdIn.nextLine(); 
      //学年の入力 
      System.out.print("学年を入力してください："); 
      int grade = stdIn.nextInt(); 
      //大原学生クラスのインスタンスを生成する  
      OharaStudent stu2 = new OharaStudent(name, grade); 
      //無事にインスタンスが出来たら、自己紹介する 
      System.out.println("こんにちは、"+stu2.getGrade()+"年生の"+stu2.getName()+"です"); 
    }catch(Exception e){ 
      //例外が発生した場合は、__(8)__ 
      System.out.println(e.getMessage()); 
    } 
 
    System.out.println("//-------------------------------------------------------------------------------//"); 
 
    //大原学生クラス型の変数に大原学園 情報処理 システム開発コースインスタンスを生成し、代入する 
    OharaStudent stu3 = new OharaSysDevStudent("大原次郎",1,100,95); 
    //無事にインスタンスが出来たら、データを表示する 
    System.out.println("こんにちは、"+stu3.getGrade()+"年生の"+stu3.getName()+"です"); 
 
    //この学生のデータを表示する 
    //お名前　ゲッターで呼び出す 
    System.out.println("お名前：" + stu3.getName()); 
    //学校名　static変数なので、クラス名.schoolNameで呼び出せる 
    System.out.println("学校名：" + OharaStudent.schoolName); 
    //コース名 これはstaticだから表示可能 
    System.out.println("コース名：" + OharaSysDevStudent.courseName + OharaSysDevStudent.courseName2); 
    //学年　ゲッターで呼び出す 
    System.out.println("学年　:" + stu3.getGrade() + "年"); 
    //javaとシステム開発演習の点数は__(9)__ 
    System.out.println("java:"+stu3.getJavaScore()); 
    System.out.println("java:"+stu3.getSysDevScore()); 
 
    System.out.println("//-------------------------------------------------------------------------------//"); 
 
    //IFGreeting型の変数に大原学園 情報処理 システム開発コース2クラスのインスタンスを生成し、代入する 
    IFGreeting stu4 = new OharaSysDevStudent2("大原三郎",1,100,95); 
    //stu4はIFGreeting型なので、greetingメソッドのみ__(10)__。 
    stu4.greeting(); 
    //この行はエラー 
    System.out.println(stu4.getName()); 
  } 
}