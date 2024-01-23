package work.Q11x6;
// 5のコピーそのまま

public class Person {

    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;

    // コンストラクタ
    public Person(String name, int age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // ゲッターとセッター

    // 名前
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 年齢
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // 性別
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    // 身長(cm)
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    // 体重(kg)
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 個人情報の表示
    public void disp_info() {
        System.out.println("名前:" + name + " 年齢:" + age + " 性別:" + gender + " 身長(cm):" + height + " 体重(kg):" + weight);
    }

    // BMIの計算
    public double get_bmi() {
        double resbmi = weight / ((height / 100) * (height / 100));
        resbmi = (int)(resbmi * 1000);
        resbmi = resbmi / 1000; 
        return resbmi;
    }

    // 肥満度の判定
    public String get_obesity() {
        double bmi = get_bmi();

        if (bmi < 18.5) {
            return "低体重（やせ型）";
        }
        else if (bmi < 25.0) {
            return "普通体重";
        }
        else if (bmi < 30.0) {
            return "肥満（1度）";
        }
        else if (bmi < 35.0) {
            return "肥満（2度）";
        }
        else if (bmi < 40.0) {
            return "肥満（3度）";
        }
        else {
            return "肥満（4度）";
        }
    }

    // 適正体重の計算
    public double get_suitable_weight() {
        double resweight = ((height / 100) * (height / 100)) * 22;
        resweight = (int)(resweight * 1000);
        resweight = resweight / 1000;
        return resweight;
    }

}