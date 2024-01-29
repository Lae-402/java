package work;

public class Q6x8 {
    public static void main(String[] args) {
        for ( int l=9; l>=1; l-- ) {
            System.out.println( l + "の段" );
            for ( int r=9; r>=1; r-- ) {
                System.err.println( l + " × " + r + " = " + (l*r) );
            }
        }
    }
}
