package work;

public class Q7x5 {
    public static void main(String[] args) {
        int i = 0;
        while ( i<100 ) {
            i++;
            if ( i%3 != 0 ) {
                System.out.println(i); 
            }
            continue;
        }
    }
}
