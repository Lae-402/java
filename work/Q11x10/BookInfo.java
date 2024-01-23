package work.Q11x10;

public class BookInfo {

    public String title;
    public String auth;
    public int pub_year;
    public int book_id;
    // static＝静的フィールド（そのクラスの全インスタンスで共有されるクラス変数）
    private static int counter = 0;

    BookInfo(String title, String auth, int pub_year) {
        this.title = title;
        this.auth = auth;
        this.pub_year = pub_year;
        this.book_id = ++counter;
    }
    
}