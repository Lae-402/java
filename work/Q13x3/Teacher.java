package work.Q13x3;

public class Teacher implements Person {

    private String name;
    private String job;
    private String subject;

    Teacher( String name, String job, String subject ){ this.name = name; this.job = job;  this.subject = subject; }
    
    @Override public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
        System.out.println("担当科目：" + subject);
    }
    
}