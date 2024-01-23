package work.Q13x3;

public class Cook implements Person {

    String name;
    String job;
    String specialities;

    Cook( String name, String job, String specialities ){ this.name = name; this.job = job;  this.specialities = specialities; }
    
    @Override public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("得意料理：" + specialities);
    }
    
}