package kouka3_Maeda;

import java.util.ArrayList;
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
    private ArrayList<String> lyrics;
    private int[] result;
    // 全てのプレイの結果を保持する配列
    private int[] allOfResult;
    private double allOfCAR;

    // コンストラクタ
    public TypingGame(){
        this.result = new int[2];
        this.allOfResult = new int[2];
        this.allOfResult[0] = 0;
        this.allOfResult[1] = 0;
        this.allOfCAR = 0;
    }

    // ------------------------------------------------------------------------
    // オーバードライブ：プレイする曲を選ぶ関数
    // 引数　：なし
    // 戻り値：プレイする曲の歌詞１文ずつを要素とする配列
    @Override public void selectSong() {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");
        Song song = new Song();
        String[] songs = song.getSongs();
        String[] artists = song.getArtists();

        // while：求める入力がされるまで
        while ( true ) {
            
            // プレイできる曲の一覧を表示
            System.out.println();
            for ( int i=0; i<songs.length; i++ ) {
                System.out.println( "【 " + (i+1) + " 】：" + songs[i] + "（" + artists[i]  + "）" );
                // System.out.print( "【 " + (i+1) + " 】："); System.out.printf("%-10s", songs[i]); System.out.println(" / " + artists[i] );
            }

            try {
            System.out.println("\n＊プレイする曲を選択してください（終了する場合は［ ctrl + C ］を押してください）" );
            int userSelect = stdIn.nextInt()-1;
            this.lyrics = song.getLyrics()[userSelect];  // プレイする歌詞を設定
            System.out.println( "\n＊『" + songs[userSelect] + "』を選択しました");
            break;  // ループを抜ける

            // 例外：整数以外の入力
            } catch ( InputMismatchException e ) {
                System.out.println( "\n＊エラー：" + e );
                System.out.println("＊整数を入力してください");
                stdIn = new Scanner(System.in, "Shift-jis");
            
            // 例外：求めていない整数の入力
            } catch ( ArrayIndexOutOfBoundsException e ) {
                System.out.println( "\n＊エラー：" + e );
                System.out.println("＊表示されている整数から選んで入力してください");
            
            // 例外：
            } catch ( NoSuchElementException e ) {
                System.out.println("\n＊終了します\n");
                System.exit(0);
            }
        }  // while ここまで
        
    }  // selectSong ここまで


    // ---------------------------------------------------------------------
    // オーバードライブ：結果を表示する関数
    // 引数　：なし
    // 戻り値：なし
    @Override public void displayResult( double CAR ) {

        // 終了メッセージ・結果の表示
        System.out.println("\n---------------------------------");
        System.out.println("＊終了！\n---------------------------------");
        System.out.println("\n＊プレイ回数：" + this.playCount);
        System.out.println("\n＊ただいまの文字数：" + (int)this.result[0]);
        System.out.println("＊ただいまの正答文字数：" + (int)this.result[1]);
        System.out.println("＊ただいまの正答率：" + CAR + " %" );
        if ( this.playCount >= 2 ) {
            System.out.println("\n＊総文字数　　　　：" + this.allOfResult[0]);
            System.out.println("＊総正答文字数　　：" + this.allOfResult[1]);
            System.out.println("＊総正答率　　　　：" + this.allOfCAR + " %");
        }

        System.out.println("\n---------------------------------\n");

    }  // displayResult ここまで


    // ---------------------------------------------------------------------
    // オーバードライブ：ゲームを実行する関数
    // 引数　：なし
    // 戻り値：なし
    @Override public void runGame() {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        // String型：再プレイをするか訊いた解答を保持
        String replay;

        // while：ユーザが終了するまで
        while ( true ) {

            // 条件：プレイが初回でない
            if ( this.playCount > 0 ) {
                // while：求める入力がされるまで
                while ( true ) {
                    System.out.println("＊もう一度プレイしますか？");
                    System.out.println("＊【1】：もう一度プレイする   【99】：やめる");
                    replay = stdIn.nextLine();

                    // switch：ユーザ入力
                    switch (replay) {

                        // ケース：1が入力された
                        case "1": case "１":
                            // swichループを抜ける
                            break;
                        // ケース：99が入力された
                        case "99": case "９９":
                            // プログラム実行終了
                            System.out.println("\n＊終了します\n");
                            System.exit(0);

                        // 想定した入力でなかった場合
                        default:
                            // 警告文を表示して再度入力へ
                            System.out.println("\n＊【1】または【99】で入力してください\n");
                    }

                    // 条件：ユーザが再プレイを選択
                    if ( replay.equals("1") || replay.equals("１") ) {
                        // whileループを抜けて続行
                        break;
                    }
                }  // while ここまで
            }  // if ここまで

            // プレイ回数を増やす
            this.playCount++;

            // プレイする曲を選ぶ関数の呼出
            selectSong();

            // プレイ
            System.out.println("\n---------------------------------\n＊[ Enter ] で開始\n---------------------------------\n");
            stdIn.nextLine();
            this.result = super.judgment(this.lyrics);

            // 条件：ユーザがタイピング開始前に終了した
            if ( result[0]==0 && result[1]==0 ) {
                // プログラム実行終了
                System.out.println("\n＊終了します\n");
                System.exit(0);
            }

            double CAR = result[1] / result[0] * 100;
            // 今プレイの結果を総合結果に加算
            this.allOfResult[0] = this.allOfResult[0] + (int)result[0];
            this.allOfResult[1] = this.allOfResult[1] + (int)result[1];
            // 総正答率（ Correct Answer Rate ）の計算
            // this.allOfCAR = (this.allOfCAR * (this.playCount-1) + this.result[2] ) / this.playCount;
            this.allOfCAR = this.allOfResult[1] / this.allOfResult[0] * 100;

            // 結果を表示する関数の呼出
            displayResult( CAR );
        }

    }  // runGame ここまで

}
