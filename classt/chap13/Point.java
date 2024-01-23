package classt.chap13;

// 抽象クラスを継承して使う
public class Point extends Shape {

    public Point() {
        // 何もしない
    }

    // 継承した 抽象クラス 内の 抽象メソッド は必ずオーバードライブ
    @Override public String toString() {
        return "Point";
    }

    @Override public void draw() {
        System.out.println("+");
    }
}