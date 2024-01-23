package work.Q11x9;

class Car {

    // フィールド
    private String carName;
    private String maker;
    private int price;

    // コンストラクタ
    public Car(String carName, String maker, int price) {
        this.carName = carName;
        this.maker = maker;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }
}