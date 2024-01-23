package work.Q13x2;

public abstract class BasicStudent {
    
    String name;
    String no;
    String schoolName;

    BasicStudent( String name, String no, String schoolName ) { this.name = name; this.no = no; this.schoolName = schoolName; }

    public abstract double calcAve();

}
