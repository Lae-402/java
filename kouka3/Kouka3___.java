// package kouka3;

// import java.util.Scanner;

// public class Kouka3___ {
//     public static void main(String[] args) {
//         Scanner stdIn = new Scanner(System.in, "Shift-jis");

//         System.out.println("プレイする曲を選択してください");
//         int userSelect = stdIn.nextInt();

//         Songs songs = new Songs();
//         String[] song = songs.select( userSelect );

//         SRIT_LyricTyping typingGame = new SRIT_LyricTyping( song );

//         typingGame.runGame();


//         // 終了メッセージ・結果の表示
//         System.out.println("\n---------------------------------");
//         System.out.println("＊終了！");
//         System.out.println("＊正確な入力文字数: " + typingGame.GetMatchCharacterCount());
//         System.out.println("＊総文字数: " + typingGame.GetTotalCharacterCount());
//         // 条件：設定歌詞の総文字数が0でない
//         if ( typingGame.GetTotalCharacterCount() != 0 ) {
//             // 正答率（ Correct Answer Rate ）の計算・表示
//             double CAR = (double) typingGame.GetMatchCharacterCount() / typingGame.GetTotalCharacterCount() * 100;
//             System.out.println("＊正答率: " + CAR + "%");
//         }
//         System.out.println("---------------------------------\n");

//     }
// }
