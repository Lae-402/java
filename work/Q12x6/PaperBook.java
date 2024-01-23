package work.Q12x6;

class PaperBook extends Book {
    int pages;

    public PaperBook( String title, String author, int price, int pages ){ super(title, author, price); this.pages = pages; }

    @Override
    public void dispInfo() {
        super.dispInfo();
        System.out.println("ページ数：" + pages + "ページ\n");
    }
}