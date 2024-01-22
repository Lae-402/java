package classt.chap12;

public class Point2D {
    int x;
    int y;

    // コンストラクタ
    Point2D(int x, int y) {this.x = x; this.y = y;}
    // Point2D(int x, int y) {
    //     this.x = x;
    //     this.y = y;
    // }

    // セッター
    void setX(int x) {this.x = x;}
    void setY(int Y) {this.y = y;}

    // ゲッター
    int getX() {return x;}
    int getY() {return y;}
}