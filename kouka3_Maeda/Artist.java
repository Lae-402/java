package kouka3_Maeda;

public class Artist {
    private String[] artistList;

    public Artist () {
        this.artistList = new String[2];
        this.artistList[0] = "椎名林檎";
        this.artistList[1] = "東京事変";
    }

    public String[] getArtistList() {
        return this.artistList;
    }
}
