package work.Q11x11;

public class Q11x11 {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent(new Student(1, "鈴木次郎", new TestResult(65, 45, 55)));
        school.addStudent(new Student(2, "山田一郎", new TestResult(80, 88, 78)));
        school.addStudent(new Student(3, "佐藤花子", new TestResult(76, 73, 87)));
        school.addStudent(new Student(4, "大原太郎", new TestResult(96, 88, 99)));
        school.addStudent(new Student(5, "田中良子", new TestResult(70, 56, 75)));
        
        school.displayStats();
    }
}
