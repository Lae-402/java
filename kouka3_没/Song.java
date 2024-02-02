package kouka3_没;

// 曲の情報を持つクラス
class Song {
    private String songTitle;
    private String composer;
    private String Writer;

    public Song(String songTitle, String composer, String Writer) {
        this.songTitle = songTitle;
        this.composer = composer;
        this.Writer = Writer;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getComposer() {
        return composer;
    }

    public String getWriter() {
        return Writer;
    }
}