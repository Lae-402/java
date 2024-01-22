package classt.chap12;

// Point2Dを継承
class Point3D extends Point2D {
    
    int z;

    // コンストラクタ
    Point3D(int x, int y, int z) {super(x, y); this.z = z;}

    void setZ(int z) {this.z = z;}
    int getZ() {return z;}
}

public class PointTester {
    public static void main(String[] args) {
        Point2D a = new Point2D(10, 15);
        Point3D b = new Point3D(20, 30, 40);
        System.out.printf("a = (%d, %d)\n", a.getX(), a.getY());
        System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
    }
}