package kouka3_没;

// アルバムの抽象クラス
abstract class AbstractAlbum implements Artist {
    protected String albumTitle;
    protected String releaseYear;

    public AbstractAlbum(String albumTitle, String releaseYear) {
        this.albumTitle = albumTitle;
        this.releaseYear = releaseYear;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    // アーティスト名を取得するメソッド
    @Override
    public abstract String getArtistName();

    // 収録曲を表示する抽象メソッド
    public abstract void displaySongs();
}