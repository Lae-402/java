package kouka3;
import java.util.NoSuchElementException;
import java.util.Scanner;

// クラス：LyricsTypingGame
// 継承：TypingGame
public class SRIT_LyricTyping implements InterfaceTyping {
    
    // フィールド
    // String型配列：設定歌詞の１文ずつを各要素とする配列
    private String[] lyrics;
    // int型：一致した文字数（0で初期化）
    private int matchCharacterCount = 0;
    // int型：設定歌詞の総文字数（0で初期化）
    private int totalCharacterCount = 0;

    // コンストラクタ
    public SRIT_LyricTyping( String[] llyrics ) {
        this.lyrics = llyrics;
    }

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

        try {
            // 外ループ：設定歌詞とユーザ入力歌詞とを１文ずつ比較対象とする
            // String型 lyric：設定歌詞から１文ずつ代入される
            for (String lyric : lyrics) {

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
                        // 条件：現在のtargetを使用した比較が初めて
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
    }  // runGame ここまで

    public int GetMatchCharacterCount () {
        return matchCharacterCount;
    }

    public int GetTotalCharacterCount () {
        return totalCharacterCount;
    }
}
