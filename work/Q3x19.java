package work;

import java.util.Scanner;

public class Q3x19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("BMI値を求めます");
        System.out.print("身長(cm)：");
        int height_cm = stdIn.nextInt();
        double height_m = (double)height_cm / 100.0;
        System.out.print("体重(kg)：");
        int weight = stdIn.nextInt();
        double bmi = (double)weight / (height_m * height_m);
        System.out.println("BMI値 ＝ " + bmi);
    }
}
