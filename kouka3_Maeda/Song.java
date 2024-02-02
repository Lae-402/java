package kouka3_Maeda;

public class Song extends Artist {

    private String[] songs;
    private String[] artists;
    private String[][] lyrics; 

    public Song() {

        // インスタンス化：Artist
            // Artist artist = new Artist();
        // String型：アーティスト一覧
        // [ "椎名林檎", "東京事変" ]
        String[] artistList = super.getArtistList();

        // 曲名の配列
        this.songs = new String[3];
        // アーティストの配列
        this.artists = new String[3];
        // 歌詞の配列
        this.lyrics = new String[3][2];

        // [0] 生きる
        this.songs  [0] = "生きる";
        this.artists[0] = artistList[1]; //東京事変
        this.lyrics [0][0] = "身体と心とが、離れてしまった。";
        this.lyrics[0][1]  = "居直れ我が生命よ。";

        // [1] 手紙
        this.songs  [1] = "手紙";
        this.artists[1] = artistList[1]; //東京事変
        this.lyrics [1][0] = "前略";
        this.lyrics [1][1] = "貴方が今日、その手を隠しても、";

        // [2] ＴＯＫＹＯ
        this.songs  [2] = "ＴＯＫＹＯ";
        this.artists[2] = artistList[0];  //椎名林檎
        this.lyrics [2][0] = "同じ夢で目覚めた。";
        this.lyrics [2][1] = "なぜ今また昔の男など現れる。";
    }

    public String[] getSongs () {
        return songs;
    }
    public String[] getArtists () {
        return artists;
    }
    public String[][] getLyrics () {
        return lyrics;
    }
}
