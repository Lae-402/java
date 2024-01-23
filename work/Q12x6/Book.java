package work.Q12x6;

class Book {
    static int counter = 0;
    String title;
    String author;
    int price;
    int id;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.id = ++counter;
    }

    public void dispInfo() {
        System.out.println("書名：" + title);
        System.out.println("著者名：" + author);
        System.out.println("価格：" + price + "円");
        System.out.println("識別番号：" + id);
    }

    public static int getCount() {
        return counter;
    }
}