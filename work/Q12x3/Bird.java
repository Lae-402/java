package work.Q12x3;

public class Bird extends Animal {
    public String name = "鳥";

    @Override public void move ( int length ) {
        System.out.println( this.name + "は、" + length + "メートル飛びました。" );
    };

}
