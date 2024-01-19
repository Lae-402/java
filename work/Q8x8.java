package work;
import java.util.Scanner;

class Q8x8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数値を3つ入力してください");
        int num;
        int[] list = new int[3];

        for(int i=0; i<3; i++){
            System.out.print((i+1) + "つ目の整数値：");
            num = stdIn.nextInt();
            list[i] = num;
        }

        int max = list[0];
        int min = list[0];

        for(int j=1; j<list.length; j++){
            if(list[j] > max)
                max = list[j];
            if(list[j] < min)
                min = list[j];
        }

        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);
    }

}