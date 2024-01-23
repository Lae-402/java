package work.Q12x3;

public class Dog extends Animal {
    public String name = "犬";

    @Override public void move ( int length ) {
        System.out.println( this.name + "は、" + length + "メートル走りました。" );
    };

}
