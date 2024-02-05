package kouka3_Maeda;

public class Artist {

    // フィールド
    // String型：アーティスト一覧
    private String[] artistList;

    // コンストラクタ
    public Artist () {
        this.artistList = new String[2];
        this.artistList[0] = "椎名林檎";
        this.artistList[1] = "東京事変";
    }

    // ゲッター：artistList
    public String[] getArtistList() {
        return this.artistList;
    }
}
