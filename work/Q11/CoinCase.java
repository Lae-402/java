package work.Q11;
import java.util.Random;

class CoinCase {

    public int I;
    public int V;
    public int X;
    public int L;
    public int C;
    public int D;

    CoinCase() {
        this.I = 0;
        this.V = 0;
        this.X = 0;
        this.L = 0;
        this.C = 0;
        this.D = 0;
    }

    public String getCount () {
        return ("1円：" + I + "枚　" + "5円：" + V + "枚" + "10円：" + X + "枚　" + "50円：" + L + "枚　" + "100円：" + C + "枚　" + "500円：" + D + "枚");
    }

    public int getAmount () {
        return (1*I + 5*V + 10*X + 50*L + 100*C + 500*D);
    }

    public void addCoins () {

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int coinType = random.nextInt(6);

            switch (coinType) {
                case 0:
                    I++;
                    break;
                case 1:
                    V++;
                    break;
                case 2:
                    X++;
                    break;
                case 3:
                    L++;
                    break;
                case 4:
                    C++;
                    break;
                case 5:
                    D++;
                    break;
            }
        }

        System.out.println(getCount());
        System.out.println("総額：" + String.format("%,d", getAmount()) + "円");
    }

}