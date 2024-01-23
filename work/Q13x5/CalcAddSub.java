package work.Q13x5;

interface InterfaceCalcAddSub {
    
    public int calcAdd( int x, int y );

    public int calcSub( int x, int y );

}

public class CalcAddSub implements InterfaceCalcAddSub {

    public int calcAdd( int x, int y ) {
        return (x+y);
    };

    public int calcSub( int x, int y ) {
        return (x-y);
    };

    
}