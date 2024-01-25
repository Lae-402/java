package work.Q13x1;

public class Cook extends Person {

    private String name;
    private String job;
    private String specialities;

    public Cook( String name, String job, String specialities ){ super(name, job); this.specialities = specialities; }
    
    @Override public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
        System.out.println("得意料理：" + this.specialities);
    }

    
}