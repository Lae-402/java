package kouka3_Maeda;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// クラス：タイピングゲーム（メイン）
// 継承：
// 実装：
public class TypingGame extends TypeJudgment implements InterfaceTypingGame {
    
    // フィールド
    private int playCount = 0;
    // String型配列：設定歌詞の１文ずつを各要素とする配列
    private String[] lyrics;
    // 全てのプレイの結果を保持する配列
    private int[] allOfResult = {0, 0};

    // コンストラクタ
    public TypingGame(){}

    // ------------------------------------------------------------------------
    // オーバードライブ：曲を選ぶ関数
    // 引数：なし
    // 戻り値：プレイする曲の歌詞１文ずつを要素とする配列
    @Override public void selectSong() {
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
                System.out.println("\n＊終了します\n");
                System.exit(0);
            }

        }  // while ここまで
        
        // return this.lyrics;
    }  // selectSong ここまで


    // ---------------------------------------------------------------------
    // オーバードライブ：結果を表示する関数
    // 引数：なし
    // 戻り値：なし
    @Override public void displayResult() {
        // 終了メッセージ・結果の表示
        System.out.println("\n---------------------------------");
        System.out.println("＊終了！");
        System.out.println("＊総プレイ回数：" + this.playCount);
        System.out.println("＊総文字数　　　：" + this.allOfResult[0]);
        System.out.println("＊正答文字数　　：" + this.allOfResult[1]);
        // 条件：設定歌詞の総文字数が0でない
        if ( this.allOfResult[0] != 0 ) {
            // 正答率（ Correct Answer Rate ）の計算・表示
            double CAR = (double) this.allOfResult[1] / this.allOfResult[0] * 100;
            System.out.println("＊正答率：" + CAR + " %");
        }
        System.out.println("---------------------------------\n");
    }  // displayResult ここまで


    // ---------------------------------------------------------------------
    // オーバードライブ：ゲームを実行する関数
    // 引数：なし
    // 戻り値：なし
    @Override public void runGame() {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");
        // String型：再プレイをするかの
        String replay;

        // while：ユーザが終了するまで
        while ( true ) {

            if ( this.playCount > 0 ) {
                while ( true ) {
                    System.out.println("＊もう一度遊びますか？【 y / n 】");
                    replay = stdIn.nextLine();
                    switch (replay) {
                        case "y":
                            break;
                        case "n":
                            System.out.println("\n＊終了します\n");
                            System.exit(0);
                        default:
                            System.out.println("＊【y】または【n】で入力してください");
                    }
                }

            }

            // プレイ回数を増やす
            this.playCount++;

            // プレイする曲を選ぶ関数の呼出
            selectSong();

            // プレイ開始
            System.out.println("\n＊[ Enter ] で開始");
            stdIn.nextLine();

            // プレイ終了
            System.out.println("---------------------------------");
            int[] result = super.judgment(this.lyrics);
            this.allOfResult[0] = this.allOfResult[0] + result[0];
            this.allOfResult[1] = this.allOfResult[1] + result[1];

            if ( this.allOfResult[0]==0 && this.allOfResult[1]==0 ) {
                System.out.println("\n＊終了します\n");
                System.exit(0);
            }

            // 結果を表示する関数の呼出
            displayResult();
        }

    }  // runGame ここまで

}
