package work.Q13x2;

public abstract class BasicStudent {
    
    private String name;
    private String no;
    private String schoolName;

    BasicStudent( String name, String no, String schoolName ) { this.name = name; this.no = no; this.schoolName = schoolName; }

    public abstract double calcAve();

    public String getName () {
        return this.name;
    }

    public String getNo () {
        return this.no;
    }

    public String getSchoolName () {
        return this.schoolName;
    }

}
