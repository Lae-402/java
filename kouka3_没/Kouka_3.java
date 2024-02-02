package kouka3_没;

import java.util.Scanner;

public class Kouka_3 {
    public static void main(String[] args) {
        // アルバム『無罪モラトリアム』の収録曲
        Song[] songs1 = {
                new Song("正しい街", "椎名林檎", "椎名林檎"),
                new Song("歌舞伎町の女王", "椎名林檎", "椎名林檎"),
                new Song("丸ノ内サディスティック", "椎名林檎", "椎名林檎"),
                new Song("幸福論（悦楽編）", "椎名林檎", "椎名林檎"),
                new Song("茜さす 帰路照らされど・・・", "椎名林檎", "椎名林檎"),
                new Song("", "椎名林檎", "椎名林檎"),
                new Song("", "椎名林檎", "椎名林檎"),
                new Song("", "椎名林檎", "椎名林檎"),
        };

        // アルバム『勝訴ストリップ』の収録曲
        Song[] songs2 = {
                new Song("AnotherSong1", "AnotherComposer1", "AnotherWriter1"),
                new Song("AnotherSong2", "AnotherComposer2", "AnotherWriter2"),
                // 他の曲も追加
        };

        // アルバム3『』
        AbstractAlbum[] albums = {
                new MyAlbum("Artist1", "Album1", "2022", songs1),
                new MyAlbum("Artist2", "Album2", "2023", songs2),
                // 他のアルバムも追加
        };

        AlbumManager albumManager = new AlbumManager(albums);

        // アルバム一覧を表示
        albumManager.displayAlbumList();

        // ユーザーにアルバムを選択させて詳細を表示
        Scanner scanner = new Scanner(System.in);
        System.out.print("詳細を表示するアルバムの番号を入力してください: ");
        int selectedAlbumIndex = scanner.nextInt();
        albumManager.displayAlbumDetails(selectedAlbumIndex);
    }
}
