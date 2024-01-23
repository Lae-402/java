package classt.chap13;

public abstract class Shape {

    // 抽象メソッド
    public abstract String toString();

    // 抽象メソッド
    public abstract void draw();

    // （普通の）メソッド
    public void print() {
        System.out.println(toString());
    }
}