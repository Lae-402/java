package classt.chap14;

public class CDPlayer implements Player {

    private int id;
    private static int count = 0;

    public CDPlayer() { id = ++count; }

    @Override public void play() {
        System.out.println("**ＣＤ再生開始！");
    }

    @Override public void stop() {
        System.out.println("**ＣＤ再生終了！");
    }

    public void printInfo() {
        System.out.println("**ヘッドをクリーニングしました。");
    }
}
