package work.Q13x5;

interface InterfaceCalcMultiDiv {
    
    public int calcMulti( int x, int y );

    public int calcDiv( int x, int y );
    
}

public class CalcMultiDiv implements InterfaceCalcMultiDiv {

    public int calcMulti( int x, int y ) {
        return (x*y);
    };

    public int calcDiv( int x, int y ) {
        return (x/y);
    };

}