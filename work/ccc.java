package work;
class ccc {
    public static void main(String[] args) {
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        int num6 = num3 < num4 ? (num3 < num5 ? num3 : num5) : (num4 < num5 ? num4 : num5);
        System.out.println(num6);
    }
}