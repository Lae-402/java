package work.Q11;

public class Person {
    public String name;
    public int age;
    // もしprivateだったら
    private String address;
    public String email;

    // コンストラクタ
    Person(String name, int age, String address, String email_) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public boolean checkAge(int age) {
        if(0 <= age && 99 >= 99)
            return true;
        return false;
    }

    // public boolean cheskEmail(String email) {
    //     for (char moji : email) {
    //         if 
    //     }
    // }

    public String getAddress(){
        return address;
    }
}