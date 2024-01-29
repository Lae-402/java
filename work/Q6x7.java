package work;

public class Q6x7 {
    public static void main(String[] args) {
        for ( int l=1; l<=9; l++ ) {
            System.out.println( l + "の段" );
            for ( int r=1; r<=9; r++ ) {
                System.err.println( l + " × " + r + " = " + (l*r) );
            }
        }
    }
}
