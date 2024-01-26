package work.Q13x1;

public abstract class Person {

    private String name;
    private String job;

    public Person( String name, String job ) { this.name = name; this.job = job; }

    public abstract void introduce();

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}