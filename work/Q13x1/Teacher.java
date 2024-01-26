package work.Q13x1;

public class Teacher extends Person {

    private String name;
    private String job;
    private String subject;

    public Teacher( String name, String job, String subject ){ super(name, job); this.subject = subject; }
    
    @Override public void introduce() {
        System.out.println("氏名：" + super.getName());
        System.out.println("職業：" + super.getJob());
        System.out.println("担当科目：" + this.subject);
    }
}