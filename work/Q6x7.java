package work;
class Q6x7 {
    public static void main(String[] args) {
        int res = 0;
        
        for(int l = 1; l <= 9; l++) {
            System.out.println(l + "の段");

            for(int r = 1; r <= 9; r++) {
                res = l*r;
                System.out.println(l + "×" + r + "=" + res);
            }
        }
    }
}