package work.Q12x2;

public class Person {
    
    String name;
    String job;

    Person( String name, String job ) { this.name = name; this.job = job; }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
    }
    
}