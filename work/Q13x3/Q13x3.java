package work.Q13x3;

public class Q13x3 {
    
    public static void main(String[] args) {
        Teacher kondo = new Teacher( "竹井一馬", "教員", "情報処理" );
        Cook okita = new Cook( "大原太郎", "シェフ", "オムライス" );

        kondo.introduce();
        System.out.println();
        okita.introduce();
    }

}