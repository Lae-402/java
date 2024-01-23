package work.Q11x18;

public class Person8 {
    public String name;
    public int age;
    public String address;
    public String email;

    // コンストラクタ
    Person8(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    // 年齢の判定
    public boolean checkAge() {
        if(0 <= age && 99 >= 99)
            return true;
        return false;
    }

    // メールアドレスの判定（GPTがリファクトしてくれた）
    public boolean checkEmail() {
        int i = email.indexOf('@');
        return (i != -1) && (i > 0) && (i < email.length()-1);
    }

    // メールアドレスの判定
    // public boolean checkEmail() {
    //     String[] emailArray = email.split("");
    //     int counter = 1;

    //     for (String s : emailArray) {

    //         if (counter == 1) {
    //             if ("@".equals(s)) {
    //                 return false;
    //             }
    //             counter++;
    //             continue;
    //         }

    //         if ("@".equals(s)) {
    //             if (counter != emailArray.length) {
    //                 return true;
    //             }
    //         }
    //         counter++;
    //     }
    //     return false;
    // }

}        