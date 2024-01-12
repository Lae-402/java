package work;
class Q7x2 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            i++;
            sum = sum + i;
        } while(i < 100);
        System.out.println("合計" + sum);
    }
}