package kouka3_没;

// 具体的なアルバムのクラス
class MyAlbum extends AbstractAlbum {
    private Song[] songs;

    public MyAlbum(String artistName, String albumTitle, String releaseYear, Song[] songs) {
        super(albumTitle, releaseYear);
        this.songs = songs;
    }

    // アーティスト名を取得するメソッドの実装
    @Override
    public String getArtistName() {
        return albumTitle; // 仮の実装
    }

    // 収録曲を表示するメソッドの実装
    @Override
    public void displaySongs() {
        System.out.println("収録曲:");
        for (Song song : songs) {
            System.out.println(
                    "  " + song.getSongTitle() + " - " + song.getComposer() + " / " + song.getWriter());
        }
    }
}