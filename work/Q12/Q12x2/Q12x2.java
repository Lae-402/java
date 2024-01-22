package work.Q12.Q12x2;

public class Q12x2 {
    
    public static void main(String[] args) {
        Teacher kondo = new Teacher( "近藤勇", "教員", "Go言語" );
        Cook okita = new Cook( "沖田総司", "シェフ", "オムライス" );

        kondo.introduce();
        System.out.println();
        okita.introduce();
    }

}
