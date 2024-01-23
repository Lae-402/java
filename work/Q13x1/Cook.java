package work.Q13x1;

public class Cook extends Person {

    String specialities;

    Cook( String name, String job, String specialities ){ super(name, job); this.specialities = specialities; }
    
    @Override public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("得意料理：" + specialities);
    }
    
}