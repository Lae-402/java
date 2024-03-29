package work.Q13x2;

public class BookKeepingStudent extends BasicStudent {
    
    private int accounting;
    private int business;

    BookKeepingStudent( String name, String no, String schoolName, int accounting, int business ){ super(name, no, schoolName); this.accounting = accounting; this.business = business; }

    @Override public double calcAve() {
        double tmp = ( ((double)accounting + (double)business) / 2 ) * 10;
        tmp = (int)tmp;
        return ( tmp / 10 );

    }

    public int getAccounting () {
        return this.accounting;
    }

    public int getBusiness () {
        return this.business;
    }
}