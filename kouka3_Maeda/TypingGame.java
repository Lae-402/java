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
    // 戻り値：なし
    @Override public void selectSong() {
        Scanner stdIn = new Scanner(System.in);

        // インスタンス化
        Song song = new Song();

        // String型：曲一覧
        String[] songs = song.getSongs();
        // String型：アーティスト一覧
        String[] artists = song.getArtists();

        // while：求める入力がされるまで
        while ( true ) {
            
            // プレイできる曲の一覧を表示
            System.out.println();
            for ( int i=0; i<songs.length; i++ ) {
                System.out.println( "【 " + (i+1) + " 】：" + songs[i] + "（" + artists[i]  + "）" );
            }

            // プレイする曲を一覧から選択させる
            System.out.println("\n＊プレイする曲を選択してください（終了する場合は［ ctrl + C ］を押してください）" );
            try {
            int userSelect = stdIn.nextInt()-1;
            // プレイする曲の歌詞を設定
            this.lyrics = song.getLyrics()[userSelect];
            // 求める入力だった場合、ループを抜ける
            System.out.println( "\n＊『" + songs[userSelect] + "』（" + artists[userSelect] + "）を選択しました");
            break;

            // 例外：整数以外の入力
            } catch ( InputMismatchException e ) {
                System.out.println( "\n＊エラー：" + e );
                System.out.println("＊整数を入力してください");
                stdIn = new Scanner(System.in, "Shift-jis");
            
            // 例外：求めていない整数の入力
            } catch ( ArrayIndexOutOfBoundsException e ) {
                System.out.println( "\n＊エラー：" + e );
                System.out.println("＊表示されている整数から選んで入力してください");
            
            // 例外：[ ctrl + C ] の押下
            } catch ( NoSuchElementException e ) {
                // プログラム実行終了
                System.out.println("\n＊終了します\n");
                System.exit(0);
            }
        }  // 終：while
        
    }  // 終：selectSong


    // ---------------------------------------------------------------------
    // オーバードライブ：結果を表示する関数
    // 引数　：今プレイの正答率
    // 戻り値：なし
    @Override public void displayResult( double CAR ) {

        // 終了メッセージ・結果の表示
        System.out.println("\n---------------------------------\n＊終了！\n---------------------------------");
        System.out.println("\n＊プレイ回数：" + this.playCount);
        System.out.println("\n＊ただいまの文字数：" + (int)this.result[0]);
        System.out.println("＊ただいまの正答文字数：" + (int)this.result[1]);
        System.out.println("＊ただいまの正答率：" + CAR + " %" );
        // 条件：プレイが初回でない
        if ( this.playCount >= 2 ) {
            System.out.println("\n＊総文字数　　　　：" + this.allOfResult[0]);
            System.out.println("＊総正答文字数　　：" + this.allOfResult[1]);
            System.out.println("＊総正答率　　　　：" + this.allOfCAR + " %");
        }
        System.out.println("\n---------------------------------\n");

    }  // 終：displayResult


    // ---------------------------------------------------------------------
    // オーバードライブ：ゲームを実行する関数
    // 引数　：なし
    // 戻り値：なし
    @Override public void runGame() {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");

        // String型：再プレイするか訊いた解答を保持
        String replay;

        // while：ユーザが終了させるまで
        while ( true ) {

            // 条件：プレイが初回でない
            // 再プレイするか選択させる
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

                }  // 終：while

            }  // 終：if

            // プレイ回数を増やす
            this.playCount++;

            // プレイする曲を選ぶ関数の呼出
            selectSong();

            // プレイ
            System.out.println("\n---------------------------------\n＊[ Enter ] で開始\n---------------------------------\n");

            try {
            stdIn.nextLine();
            // 例外：[ ctrl + C ] の押下
            } catch ( NoSuchElementException e ) {
                // プログラム実行終了
                System.out.println("\n＊終了します\n");
                System.exit(0);
            }

            // タイピング→正誤判定を行う関数の呼出
            // 引数：プレイする曲の歌詞
            this.result = super.judgment(this.lyrics);

            // 条件：ユーザがタイピング開始前に終了した
            if ( result[0]==0 && result[1]==0 ) {
                // プログラム実行終了
                System.out.println("\n＊終了します\n");
                System.exit(0);
            }

            // 今プレイの結果を総合結果に加算
            this.allOfResult[0] = this.allOfResult[0] + (int)result[0];
            this.allOfResult[1] = this.allOfResult[1] + (int)result[1];
            // 総正答率（ Correct Answer Rate ）の計算
            this.allOfCAR = this.allOfResult[1] / this.allOfResult[0] * 100;

            // 結果を表示する関数の呼出
            // 引数：今プレイの正答率
            displayResult( result[1] / result[0] * 100 );

        }  // 終：while

    }  // 終：runGame

}  // 終：TypingGame