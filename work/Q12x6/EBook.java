package work.Q12x6;

class EBook extends Book {
    int fileSize;

    public EBook( String title, String author, int price, int fileSize ){ super(title, author, price); this.fileSize = fileSize; }

    @Override
    public void dispInfo() {
        super.dispInfo();
        System.out.println("ファイルサイズ：" + fileSize + "KB\n");
    }
}