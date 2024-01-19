package work;

class Q8x5 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};

        int sum = 0;
        float ave = 0;

        for(int i : list) {
            sum = sum + i;
        }

        ave = sum / list.length;
        System.out.println("合計値は" + sum + "です");
        System.out.println("平均値は" + ave + "です");
    }
 
}