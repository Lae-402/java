package work.Q11;

class Q11x7 {
    public static void main(String[] args) {

        Student[] students = {
            new Student("A", "001", 89, 65, 88),
            new Student("B", "002", 80, 95, 64),
            new Student("C", "003", 70, 80, 98)
        };

        for (Student student : students) {
            double ave = student.calc_ave();
            ave = (int)(ave * 100);
            ave = ave / 100;
            System.out.println(student.id + " 番　" + student.name + "さん　平均点" + ave);
        }
    }
}