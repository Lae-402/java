package kouka3_Maeda;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TypingGame_待避 implements InterfaceTypingGame {
    
    // フィールド
    // String型：プレイする曲の曲名
    // private String playSongTitle;
    // String型配列：設定歌詞の１文ずつを各要素とする配列
    private String[] lyrics;

    // int型：一致した文字数（0で初期化）
    private int matchCharacterCount = 0;
    // int型：設定歌詞の総文字数（0で初期化）
    private int totalCharacterCount = 0;

    // コンストラクタ
    public TypingGame_待避(){}

    // ------------------------------------------------------------------------
    // オーバードライブ：曲を選ぶ関数
    // 引数：なし
    // 戻り値：プレイする曲の歌詞１文ずつを要素とする配列
    @Override public String[] selectSong() {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");
        Song song = new Song();
        String[] songs = song.getSongs();

        // while：正常な入力がされるまで
        while ( true ) {
            
            System.out.println();
            for ( int i=0; i<songs.length; i++ ) {
                System.out.println( i+1 + "：" + songs[i] );
            }
            try {
            System.out.println("\n＊プレイする曲を選択してください（終了する場合は［ ctrl + C ］を押してください）" );
            int userSelect = stdIn.nextInt()-1;
            this.lyrics = song.getLyrics()[userSelect];  // プレイする歌詞を設定
            System.out.println( "\n＊" + songs[userSelect] + "を選択しました");
            break;
            } catch ( InputMismatchException e ) {
                System.out.println( "\n＊エラー：" + e );
                System.out.println("＊整数を入力してください");
                stdIn = new Scanner(System.in, "Shift-jis");
            } catch ( ArrayIndexOutOfBoundsException e ) {
                System.out.println( "\n＊エラー：" + e );
                System.out.println("＊表示されている整数から選んで入力してください");
            } catch ( NoSuchElementException e ) {
                System.out.println("\n＊終了します");
            }

        }  // while ここまで
        
        return this.lyrics;
    }  // selectSong ここまで


    // ---------------------------------------------------------------------
    // オーバードライブ：結果を表示する関数
    // 引数：なし
    // 戻り値：なし
    @Override public void displayResult() {
        // 終了メッセージ・結果の表示
        System.out.println("\n---------------------------------");
        System.out.println("＊終了！");
        System.out.println("＊正確な入力文字数: " + matchCharacterCount);
        System.out.println("＊総文字数: " + totalCharacterCount);
        // 条件：設定歌詞の総文字数が0でない
        if ( totalCharacterCount != 0 ) {
            // 正答率（ Correct Answer Rate ）の計算・表示
            double CAR = (double) matchCharacterCount / totalCharacterCount * 100;
            System.out.println("＊正答率: " + CAR + "%");
        }
        System.out.println("---------------------------------\n");
    }  // displayResult ここまで


    // ---------------------------------------------------------------------
    // オーバードライブ：ゲームを実行する関数
    // 引数：なし
    // 戻り値：なし
    @Override public void runGame() {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");
        // int型：設定歌詞のインデックス（0で初期化）
        int i = 0;
        // int型：ユーザ入力歌詞のインデックス（0で初期化）
        int j = 0;
        // int型：一致文字数にカウントするかどうかの指標（0で初期化）
        int checkCount = 0;
        // int型：設定歌詞の総文字数
        int totalLyricLength = 0;

        // プレイする曲を選ぶ関数の呼出
        lyrics = selectSong();

        // 開始直前の操作
        System.out.println("\n＊[ Enter ] で開始");
        stdIn.nextLine();
        System.out.println("---------------------------------");

        try {
            // 外ループ：設定歌詞とユーザ入力歌詞とを１文ずつ比較対象とする
            // String型 lyric：設定歌詞から１文ずつ代入される
            for (String lyric : this.lyrics) {

                // lyricの文字数を設定歌詞の総文字数に加算
                totalLyricLength = lyric.length();
                totalCharacterCount = totalCharacterCount + totalLyricLength;

                // lyricを表示
                System.out.println( "\n" + lyric + "（＊終了する場合は［ ctrl + C ］を押してください）" );
                // char型配列：ユーザ入力歌詞の１文字ずつを各要素とする配列
                char[] userInput = stdIn.nextLine().toCharArray();
                i = 0;  // i をリセット
                j = 0;  // j をリセット
                
                // 内ループ：１文字ずつ比較
                // while：設定歌詞・ユーザ入力歌詞のどちらも比較し終えていない
                while (i < lyric.length() && j < userInput.length) {
                    // char型：lyric内の添字i
                    char targetChar = lyric.charAt(i);
                    // char型：ユーザ入力歌詞の添字j
                    char inputChar = userInput[j];
                    // 条件：比較中の２つの文字が一致
                    if (targetChar == inputChar) {
                        // 条件：現在のtargetCharを使用した比較が初めて
                        if ( checkCount == 0 ) {
                            // 一致文字数を増やす
                            matchCharacterCount++; }
                        i++; j++;  // 現在の比較を終了
                        checkCount = 0; // 一致の指標をリセット
                    } else {  // 一致しなかった場合
                        // 次回以降の比較で一致文字数を増やさないようにする
                        checkCount++;
                        // 余計な文字をスキップ
                        j++;
                    }
                }  // 終：内ループ
            }  // 終：外ループ

        // 例外：[Ctrl+C]が押下されたとき
        } catch ( NoSuchElementException e ) {
            // 直前の設定歌詞総文字数の加算を取り消す
            totalCharacterCount = totalCharacterCount - totalLyricLength;
        }

        // 結果を表示する関数の呼出
        displayResult();

    }  // runGame ここまで

}
