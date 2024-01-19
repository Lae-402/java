package work.Q11;

public class CalcSum {

    // フィールド
    public int x;
    public int y;

    // コンストラクタ
    CalcSum(int x, int y){
        this.x = x;
        this.y = y;
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