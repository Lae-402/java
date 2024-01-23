package work.Q12x6;

public class Q12x6 {
    public static void main(String[] args) {
        PaperBook book1 = new PaperBook("吾輩は猫である", "夏目漱石", 850, 245);
        PaperBook book2 = new PaperBook("ノルウェイの森", "村上春樹", 1200, 328);
        EBook book3 = new EBook("Python入門", "Python.org", 2400, 9824);
        EBook book4 = new EBook("Web技術の仕組み", "www.org", 4530, 12458);

        book1.dispInfo();
        book2.dispInfo();
        book3.dispInfo();
        book4.dispInfo();

        System.out.println("与えた識別番号 ＝ " + Book.getCount() + "個");
    }
}
