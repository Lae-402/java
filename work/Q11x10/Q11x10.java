package work.Q11x10;

class Q11x10 {

    public static void main(String[] args) {

        BookInfo[] books = {
            new BookInfo("三国志", "吉川英治", 1989),
            new BookInfo("楊令伝", "北方謙三", 2011),
            new BookInfo("竜馬がゆく", "司馬遼太郎", 1998),
            new BookInfo("坊ちゃん", "夏目漱石", 1906),
            new BookInfo("吾輩は猫である", "夏目漱石", 1905),
        };

        for (BookInfo book : books) {
            System.out.println("書　　名：" + book.title);
            System.out.println("著 者 名：" + book.auth);
            System.out.println("出 版 年：" + book.pub_year);
            System.out.println("書籍番号：" + book.book_id);
        }

    }
}