package work.Q11x2;

public class CalcSum {

    // フィールド
    static public int x;
    static public int y;

    static {
        x = 100;
        y = 200;
    }

    public int calc () {
        int i = x;
        int sum = 0;
        while (i <= y) {
            sum = sum + i;
            i++;
        }
        return sum;
    }
}