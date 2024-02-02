package kouka3_没;

// アルバムの管理を行うクラス
class AlbumManager {
    private AbstractAlbum[] albums;

    public AlbumManager(AbstractAlbum[] albums) {
        this.albums = albums;
    }

    // アルバム一覧を表示するメソッド
    public void displayAlbumList() {
        System.out.println("アルバム一覧:");
        for (AbstractAlbum album : albums) {
            System.out.println(album.getAlbumTitle() + " - " + album.getReleaseYear());
        }
    }

    // 特定のアルバムの収録曲を表示するメソッド
    public void displayAlbumDetails(int albumIndex) {
        if (albumIndex >= 0 && albumIndex < albums.length) {
            AbstractAlbum selectedAlbum = albums[albumIndex];
            System.out.println("アルバム詳細:");
            System.out.println("タイトル: " + selectedAlbum.getAlbumTitle());
            System.out.println("アーティスト: " + selectedAlbum.getArtistName());
            System.out.println("リリース年: " + selectedAlbum.getReleaseYear());
            selectedAlbum.displaySongs();
        } else {
            System.out.println("無効なアルバムインデックスです。");
        }
    }
}