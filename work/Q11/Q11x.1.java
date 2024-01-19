package work.Q11;
import java.util.Scanner;

class Q11x1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径を整数値で入力：");
        int r = stdIn.nextInt();
        Circle aaa = new Circle(r);

        double lon = aaa.calc_lon();
        lon = (int)(lon * 1000);
        lon = lon / 1000;
        System.out.println("円周の長さは" + lon + "です");

        double area = aaa.calc_area();
        area = (int)(area * 1000);
        area = area / 1000;
        System.out.println("円の面積は" + area + "です");
    }
}