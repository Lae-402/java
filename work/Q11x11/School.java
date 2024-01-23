package work.Q11x11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class School {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displaySubjectStats(String subject, int max, int min, double average) {
        System.out.println(subject + "の最高点：" + max);
        System.out.println(subject + "の最低点：" + min);
        System.out.printf(subject + "の平均点：%.2f\n", average);
    }

    public void displayStats() {
        // 学生リストを平均点でソート
        Collections.sort(students);

        // 表示
        Student.displayHeader();
        for (Student student : students) {
            student.displayStudentInfo();
        }

        System.out.println();
        
        displaySubjectStats("国語", Student.maxJp, Student.minJp, Student.sumJp / (double) students.size());
        displaySubjectStats("数学", Student.maxMa, Student.minMa, Student.sumMa / (double) students.size());
        displaySubjectStats("英語", Student.maxEn, Student.minEn, Student.sumEn / (double) students.size());
    }
}