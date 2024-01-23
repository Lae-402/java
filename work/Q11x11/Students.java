package work.Q11x11;

class Student implements Comparable<Student> {

    // フィールド
    static int maxJp = 0;
    static int minJp = Integer.MAX_VALUE;
    static int sumJp = 0;
    static int maxMa = 0;
    static int minMa = Integer.MAX_VALUE;
    static int sumMa = 0;
    static int maxEn = 0;
    static int minEn = Integer.MAX_VALUE;
    static int sumEn = 0;
    int studentNumber;
    String name;
    TestResult testResult;

    // コンストラクタ
    public Student(int studentNumber, String name, TestResult testResult) {
        // 学生の情報
        this.studentNumber = studentNumber;
        this.name = name;
        this.testResult = testResult;
        // 国語
        maxJp = Math.max(maxJp, testResult.jp);
        minJp = Math.min(minJp, testResult.jp);
        sumJp += testResult.jp;
        // 数学
        maxMa = Math.max(maxMa, testResult.ma);
        minMa = Math.min(minMa, testResult.ma);
        sumMa += testResult.ma;
        // 英語
        maxEn = Math.max(maxEn, testResult.en);
        minEn = Math.min(minEn, testResult.en);
        sumEn += testResult.en;
    }
    // コンストラクタ　終


    public double calcAve() {
        return (testResult.jp + testResult.ma + testResult.en) / 3.0;
    }

    public static void displayHeader() {
        System.out.println("No\t名前\t\t国語\t数学\t英語\t平均点");
    }

    public void displayStudentInfo() {
        System.out.printf("%03d\t%s\t%d\t%d\t%d\t%.2f\n",
                studentNumber, name, testResult.jp, testResult.ma, testResult.en, calcAve());
    }

    @Override
    public int compareTo(Student other) {
        // 平均点で比較
        return Double.compare(other.calcAve(), this.calcAve());
    }
}