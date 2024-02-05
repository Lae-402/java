package kouka3_Maeda;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


// クラス：判定
public class TypeJudgment {

    // int型配列：判定結果を戻り値とするための配列
    private int[] result = {0, 0};


    // メソッド：ユーザに歌詞を入力させ、判定
    // 引数：選択した曲の歌詞の配列
    // 戻り値：判定結果を格納した配列
    public int[] judgment( ArrayList<String> lyric ) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

            // int型：設定歌詞の文字数
        int targetCharCount = 0;
    // int型：正答文字数
        int matchCharCount = 0;

        // string型：ユーザの入力を保持
        String userInput;

        // 外ループ：設定歌詞とユーザ入力歌詞とを１文ずつ比較対象とする
        // String型 lyric：設定歌詞から１文ずつ代入される
        for (String targetSentence : lyric) {

            // lyricの文字数を設定歌詞の総文字数に加算
            targetCharCount = targetCharCount + targetSentence.length();

            // lyricを表示
            System.out.println( "\n" + targetSentence + "（＊終了する場合は［ ctrl + C ］を押してください）" );

            try {
                // String型：ユーザの入力歌詞で初期化
                userInput = stdIn.nextLine();
            // 例外：[Ctrl+C]が押下されたとき
            } catch ( NoSuchElementException e ) {
                // 直前の設定歌詞総文字数の加算を取り消す
                targetCharCount = targetCharCount - targetSentence.length();
                return this.result;
            }

            // 判定結果を保持（-2で初期化）
            int judge = -2;
            // int型：indexOfの結果を保持（0で初期化）
            int searchIndex = 0;
            int tmp = -1;
            
            // 内ループ：targetLylicを左から１文字ずつ、userInupt内の初登場位置をuserInputLeftとし、
                    // ：
            // for：
            // int型：targetSentenceを１文字ずつ参照するためのインデックス（0で初期化）

            // for ( int targetIndex=0; targetIndex<targetSentence.length(); targetIndex++ ) {
            //             // System.out.print(searchIndex + "\t");
            //     judge = userInput.indexOf( targetSentence.substring(targetIndex, targetIndex+1), searchIndex);
            //     System.out.println( targetSentence.substring(targetIndex, targetIndex+1) + "\t" + judge + "\t\t" + userInput.substring( searchIndex ) );
            //             // System.out.println("＠" + targetSentence.substring(targetIndex, targetIndex+1) + "\t mI : " + searchIndex + "  \t" + userInput.substring(searchIndex) + "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

            //     // 条件：一致する文字が無い
            //     if ( judge == -1 ) {
            //         continue;
            //     // 条件：判定結果が正解
            //     } else if ( judge-1 == tmp ) {
            //         tmp = searchIndex;
            //         this.matchCharCount++;
            //         searchIndex++;
            //     } else {
            //         tmp = judge;  //j???
            //         searchIndex = judge ;
            //     }
            // }  // 終：内ループ

            for ( int targetIndex=0; targetIndex<targetSentence.length(); targetIndex++ ) {
                judge = userInput.indexOf( targetSentence.substring(targetIndex, targetIndex+1), searchIndex);

                // // 条件：一致する文字が無い（ 脱字または誤字 ）
                // if ( judge == -1 ) {
                //     continue;

                // // 条件：正解
                // } else if ( judge == tmp+1 ) {
                //     tmp = judge;
                //     matchCharCount++;
                //     searchIndex++;
                
                // // 条件：衍字
                // } else {
                //     tmp = judge;  //???
                //     searchIndex = judge + 1;
                // }

                // 条件：正解
                if ( judge == tmp+1 ) {
                    matchCharCount++;
                    tmp = judge;
                    searchIndex++;
                // 条件：衍字
                } else if ( judge != -1 && judge != (tmp + 1) ) {
                    tmp = judge;
                    searchIndex = judge + 1;
                }
                // 脱字の時は何もしない
            }
            
            

        }  // 終：外ループ

        this.result[0] = targetCharCount;
        this.result[1] = matchCharCount;

        return this.result;
    };
    
}
