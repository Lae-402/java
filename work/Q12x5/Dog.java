package work.Q12x5;

public class Dog extends Animal {
    public String name = "犬";

    @Override public void move ( int length ) {
        System.out.println( this.name + "は、" + length + "メートル走りました。" );
    };

    @Override public void eat ( String food ) {
        System.out.println( this.name + "は、" + food + "を食べました。" );
    }
    
}
