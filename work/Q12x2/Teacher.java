package work.Q12x2;

public class Teacher extends Person {

    String subject;

    Teacher( String name, String job, String subject ){ super(name, job); this.subject = subject; }
    
    public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
        System.out.println("担当科目：" + this.subject);
    }
    
}