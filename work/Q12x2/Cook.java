package work.Q12x2;

public class Cook extends Person {

    String specialities;

    Cook( String name, String job, String specialities ){ super(name, job); this.specialities = specialities; }
    
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("得意料理：" + specialities);
    }
    
}