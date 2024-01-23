package work.Q13x4;

public class CalcExcuter implements CalcAddSub, CalcMultiDiv {
    
    public void dispAdd( int x, int y ) {
        System.out.println( "足し算の結果：" + (x+y) );
    };

    public void dispSub( int x, int y ) {
        System.out.println( "引き算の結果：" + (x-y) );
    };

    public void dispMulti( int x, int y ) {
        System.out.println( "掛け算の結果：" + (x*y) );
    };

    public void dispDiv( int x, int y ) {
        if ( (x%y) == 0 )
            System.out.println( "割り算の結果：" + (x/y) );
        else
            System.out.println( "割り算の結果：" + (double)x/(double)y );
    };

}
