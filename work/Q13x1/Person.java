package work.Q13x1;

public abstract class Person {

    String name;
    String job;

    Person( String name, String job ) { this.name = name; this.job = job; }

    public abstract void introduce();

}