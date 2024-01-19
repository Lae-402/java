package work.Q11;

public class Student {
    public String name;
    public String id;
    public int ja;
    public int math;
    public int en;

    Student(String name, String id, int ja, int math, int en) {
        this.name = name;
        this.id = id;
        this.ja = ja;
        this.math = math;
        this.en = en;　　　　276
    }

    public double calc_ave () {
        return (((double)ja + (double)math + (double)en)/3);
    }

    public double calc_sum () {
        return (ja + math + en);
    }
}