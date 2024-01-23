package work.Q13x2;

public class ITStudent extends BasicStudent {

    int html;
    int javaScript;
    int java;

    ITStudent( String name, String no, String schoolName, int html, int javaScript, int java ){ super(name, no, schoolName); this.html = html; this.javaScript = javaScript; this.java = java; }

    @Override public double calcAve() {
        double tmp = ( ((double)html + (double)javaScript + (double)java) / 3 ) * 10;
        tmp = (int)tmp;
        return ( tmp / 10 );
    }
}
