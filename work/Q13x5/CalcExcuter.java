package work.Q13x5;

public class CalcExcuter implements InterfaceCalcAddSub, InterfaceCalcMultiDiv {

    private CalcAddSub interfaceCalcAddSub;
    private CalcMultiDiv interfaceCalcMultiDiv;

    public CalcExcuter() {
    this.interfaceCalcAddSub = new CalcAddSub();
    this.interfaceCalcMultiDiv = new CalcMultiDiv();
    }


    public int calcAdd(int x, int y) {
        return interfaceCalcAddSub.calcAdd(x, y);
    }

    public int calcSub(int x, int y) {
        return interfaceCalcAddSub.calcSub(x, y);
    }

    public int calcMulti(int x, int y) {
        return interfaceCalcMultiDiv.calcMulti(x, y);
    }
    
    public int calcDiv(int x, int y) {
        return interfaceCalcMultiDiv.calcDiv(x, y);
    }

}
