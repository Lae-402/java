package kouka3;

public abstract class AbstractTyping {
    
    private String[][] songs;

    public AbstractTyping() {
        this.songs = new String[2][2];
        // 生きる
        this.songs[0][0] = "身体と心とが、離れてしまった。";
        this.songs[0][1] = "居直れ我が生命よ。";
        // 手紙
        this.songs[1][0] = "前略";
        this.songs[1][0] = "貴方が今日、その手を隠しても、";
    }

    public String[] select ( int num ) {
        return this.songs[num];
    }
}
