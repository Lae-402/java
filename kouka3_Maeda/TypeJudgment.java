package kouka3_Maeda;

import java.util.NoSuchElementException;
import java.util.Scanner;


// クラス：判定
public class TypeJudgment {

    // int型：設定歌詞の一文ずつの文字数を保持
    private int lyricLength;
    // int型：設定歌詞の文字数
    private int targetCharCount = 0;
    // int型：正答文字数
    private int matchCharCount = 0;
    // int型配列：判定結果を戻り値とするための配列
    private int[] result = new int[2];


    // メソッド：ユーザに歌詞を入力させ、判定
    // 引数：選択した曲の歌詞の配列
    // 戻り値：判定結果を格納した配列
    public int[] judgment( String[] lyrics ) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");


        try {
            // 外ループ：設定歌詞とユーザ入力歌詞とを１文ずつ比較対象とする
            // String型 lyric：設定歌詞から１文ずつ代入される
            for (String targetLyric : lyrics) {

                // lyricの文字数を設定歌詞の総文字数に加算
                lyricLength = targetLyric.length();
                this.targetCharCount = this.targetCharCount + lyricLength;

                // lyricを表示
                System.out.println( "\n" + targetLyric + "（＊終了する場合は［ ctrl + C ］を押してください）" );

                // int targetIndex = 0;
                // String型：ユーザの入力歌詞で初期化
                String userInput = stdIn.nextLine();
                // int型：判定結果を格納（-1で初期化）
                int matchIndex = -2;
                int tmp = -1;
                
                // 内ループ：targetLylicを左から１文字ずつ、userInupt内の初登場位置をuserInputLeftとし、
                //         ：
                // for：
                // int型：targetLyricを１文字ずつ参照するためのインデックス（0で初期化）
                for ( int targetIndex=0; targetIndex<targetLyric.length(); targetIndex++ ) {
                            System.out.print(matchIndex + "\n");
                    matchIndex = userInput.indexOf( targetLyric.substring(targetIndex, targetIndex+1), matchIndex+1);
                            System.out.print("＠tI=\t"+targetIndex + ",\ttmp=\t"+tmp + "\t\t");
                            // System.out.println("＠" + targetLyric.substring(targetIndex, targetIndex+1) + "：" + userInput.substring(matchIndex, matchIndex+1) + " ＝ " + matchIndex + "   tmp = " + tmp );
                            System.out.println("＠" + targetLyric.substring(targetIndex, targetIndex+1) + "\t" + userInput.substring(matchIndex+1) + "\t=\t" + matchIndex);
                    // 一致する文字がなかった場合
                    if ( matchIndex == -1 ) {
                        // targetIndex++;
                        continue;
                    } else if (matchIndex-1 == tmp) {
                        this.matchCharCount++;
                    }
                    tmp = matchIndex;
                    matchIndex++;
                }  // 終：内ループ

            }  // 終：外ループ

        // 例外：[Ctrl+C]が押下されたとき
        } catch ( NoSuchElementException e ) {
            // 直前の設定歌詞総文字数の加算を取り消す
            this.targetCharCount = this.targetCharCount - lyricLength;
        }

        this.result[0] = this.targetCharCount;
        this.result[1] = this.matchCharCount;

        return result;
    };
    
}
