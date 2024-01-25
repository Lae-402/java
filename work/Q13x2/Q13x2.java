package work.Q13x2;
import java.util.Scanner;

public class Q13x2 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        System.out.print("簿記学校生の名前を入力してください："); String bk_name = stdIn.nextLine();
        System.out.print( bk_name + "さんの学生番号を入力してください：" ); String bk_no = stdIn.nextLine();
        System.out.print( bk_name + "さんの学校名を入力してください：" ); String bk_SN = stdIn.nextLine();
        System.out.print( bk_name + "さんの会計学の得点を入力してください：" ); int bk_acc = stdIn.nextInt();
        System.out.print( bk_name + "さんのビジネスの得点を入力してください：" ); int bk_bus = stdIn.nextInt();

        stdIn.nextLine();

        System.out.print("情報学校生の名前を入力してください：");
        String it_name = stdIn.nextLine();
        System.out.print( it_name + "さんの学生番号を入力してください：");
        String it_no = stdIn.nextLine();
        System.out.print( it_name + "さんの学校名を入力してください：");
        String it_SN = stdIn.nextLine();
        System.out.print( it_name + "さんのhtmlの得点を入力してください：");
        int it_html = stdIn.nextInt();
        System.out.print( it_name + "さんのjavaScriptの得点を入力してください：");
        int it_JS = stdIn.nextInt();
        System.out.print( it_name + "さんのjavaの得点を入力してください：");
        int it_java = stdIn.nextInt();

        
        BookKeepingStudent a = new BookKeepingStudent(bk_name, bk_no, bk_SN, bk_acc, bk_bus);
        ITStudent b = new ITStudent(it_name, it_no, it_SN, it_html, it_JS, it_java);

        System.out.println( a.getSchoolName() + "の学生番号" + a.getNo() + " " + a.getName() + "さんの平均点は" + a.calcAve() + "点です。" );
        System.out.println( b.getSchoolName() + "の学生番号" + b.getNo() + " " + b.getName() + "さんの平均点は" + b.calcAve() + "点です。" );
    }
}
