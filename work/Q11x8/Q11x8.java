package work.Q11x18;

class Q11x8 {
    public static void main(String[] args) {
        Person8[] people = {
            new Person8("Ａ", 18, "千代田区神田神保町 1-1", "aaa@mail.com"),
            new Person8("Ｂ", -3, "横浜市西区桜木町 2-2-2", "bbb@mail.com"),
            new Person8("Ｃ", 20, "さいたま市北区大原 3-3", "@email.co.jp"),
        };

        


    for (Person8 person : people) {
        String flag = "正常";
        if (!person.checkAge() || !person.checkEmail()) {
            flag = "異常";
        }
        System.out.println(person.name + "さん　" + person.age + "歳　" + person.address + "　" + person.email + "　" + flag);
        }
    }
}

