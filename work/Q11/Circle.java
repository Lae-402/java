package work.Q11;

class Circle{

    // フィールド
    // こっちがthis
    public int r;
    public double PI = 3.1415;

    // コンストラクタ
    Circle(int r){
        this.r = r;
    }

    // クラス内のメソッドは大体publicを先頭つけるらしいbyたかはし
    public double calc_lon () {
        return ((r * 2) * PI);
    }

    public double calc_area () {
        return (r * r * PI);
    }
}