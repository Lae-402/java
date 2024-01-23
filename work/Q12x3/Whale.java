package work.Q12x3;

public class Whale extends Animal {
    public String name = "鯨";

    @Override public void move ( int length ) {
        System.out.println( this.name + "は、" + length + "キロメートル泳ぎました。" );
    };

}
