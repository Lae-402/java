package work.Q11;

class Q11x6 {
    public static void main(String[] args) {
        
        Person person = new Person("鈴木太郎", 42, "男性", 179.3, 72.7);

        // -------------------------------------------
        // Q11x5からの更新部分
        person.setAge(44);
        person.setHeight(178.5);
        person.setWeight(88.9);
        // -------------------------------------------

        person.disp_info();

        double bmi = person.get_bmi();
        System.out.println("BMI値 = " + bmi);

        String obesity = person.get_obesity();
        System.out.println("肥満度判定 = " + obesity);

        double suitableWeight = person.get_suitable_weight();
        System.out.println("適正体重 = " + suitableWeight + "kg");
    }
}