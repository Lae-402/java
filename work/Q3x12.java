package work;

public class Q3x12 {
    public static void main(String[] args) {

        System.out.println( 1+2 );              //3
        System.out.println( 7+7/7+7 );          //15
        System.out.println( 7+7*7/7+7 );        //21
        System.out.println( 7+(7+7*7/7+7) );    //28

        // 構文エラー（「//はコメントとして認識される」）
        // System.out.println( 1+2//3-4%5**2 );

        // Incompatible operand types int and String
        // Stringとintは比較できない
        // System.out.println( 100=="100" );
    }
}
