// タイピングゲームの実装クラス
class LyricsTypingGame implements TypingGame {
    private String[] lyrics; // 歌詞の配列

    public LyricsTypingGame(String[] lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int correctCharacterCount = 0;
        int totalCharacterCount = 0;

        System.out.println("歌詞タイピングゲームを開始します。");

        for (String lyric : lyrics) {
            System.out.println(lyric);

            char[] expectedChars = lyric.toCharArray();
            char[] userInputChars = scanner.nextLine().toCharArray();

            int minLength = Math.min(expectedChars.length, userInputChars.length);

            for (int i = 0; i < minLength; i++) {
                totalCharacterCount++;

                if (expectedChars[i] == userInputChars[i]) {
                    correctCharacterCount++;
                }
            }
        }

        displayResult(correctCharacterCount, totalCharacterCount);
        scanner.close(); // スキャナーを閉じる
    }

    @Override
    public void displayResult(int correctCharacterCount, int totalCharacterCount) {
        System.out.println("ゲーム終了！");

        System.out.println("正確な入力文字数: " + correctCharacterCount);
        System.out.println("総文字数: " + totalCharacterCount);
        double accuracy = (double) correctCharacterCount / totalCharacterCount * 100;
        System.out.println("正答率: " + accuracy + "%");
    }
}












    // 一致度の計算メソッド
    private static int calculateMatchCount(String target, String input) {
        int matchCount = 0;
        int i = 0;  // targetのインデックス
        int j = 0;  // inputのインデックス

        while (i < target.length() && j < input.length()) {
            char targetChar = target.charAt(i);
            char inputChar = input.charAt(j);

            if (targetChar == inputChar) {
                // 文字が一致した場合
                matchCount++;
                i++;
                j++;
            } else {
                // 文字が一致しなかった場合、余計な文字をスキップ
                j++;
            }
        }

        return matchCount;
    }