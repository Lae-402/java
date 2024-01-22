package work.Q12.Q12x2;

public class Teacher extends Person {

    String subject;

    Teacher( String name, String job, String subject ){ super(name, job); this.subject = subject; }
    
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("担当科目：" + subject);
    }
    
}