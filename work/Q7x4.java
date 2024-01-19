package work;

class Q7x4 {

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(sum<=100000) {
            sum = sum + i;
            i++;
        }
        System.out.println("合計が100000を越えるnは" + (i-1) + "です");
    }

}