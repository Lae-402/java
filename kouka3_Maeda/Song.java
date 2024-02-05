package kouka3_Maeda;
import java.util.ArrayList;

// クラス：曲
// 継承：アーティスト
public class Song extends Artist {

    // ArrayList<String> arrayList = new ArrayList<String>();

    private ArrayList<String>[] lyrics = new ArrayList[3];

    // フィールド
    // String型配列：
    private String[] songs;
    // String型配列：
    private String[] artists;


    // コンストラクタ
    public Song() {

        // String型：アーティスト一覧（[ "椎名林檎", "東京事変" ]）
        String[] artistList = super.getArtistList();
    
        // 配列本体の生成
        this.songs = new String[3];
        this.artists = new String[3];
        // this.lyrics = new ArrayList<String>[3];
        for (int i=0; i<3; i++) {
            lyrics[i] = new ArrayList<String>();
        }

        // [0] 生きる
        this.songs  [0] = "生きる";
        this.artists[0] = artistList[1]; //東京事変
        // this.lyrics [0].add("身体と心とが、離れてしまった。");
        this.lyrics [0].add(("とうきょう"));

        // [1] 手紙
        this.songs  [1] = "手紙";
        this.artists[1] = artistList[1]; //東京事変
        this.lyrics [1].add("うきぐも");
        // this.lyrics [1].add("前略");
        // this.lyrics [1].add("貴方が今日、その手を隠しても、");

        // [2] ＴＯＫＹＯ
        this.songs  [2] = "ＴＯＫＹＯ";
        this.artists[2] = artistList[0];  //椎名林檎
        this.lyrics [2].add("同じ夢で目覚めた。");
        this.lyrics [2].add("なぜ今また昔の男など現れる。");
    }

    // ゲッター：songs
    public String[] getSongs () {
        return songs;
    }

    // ゲッター：artists
    public String[] getArtists () {
        return artists;
    }

    // ゲッター：lyrids
    public ArrayList<String>[] getLyrics () {
        return lyrics;
    }
}