package work.Q12x5;

public class Human extends Animal {
    public String name = "人";

    @Override public void move ( int length ) {
        System.out.println( this.name + "は、" + length + "メートル歩きました。" );
    };

    @Override public void eat ( String food ) {
        System.out.println( this.name + "は、" + food + "を食べました。" );
    }
    
}
