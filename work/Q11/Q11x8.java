package work.Q11;

class Q11x8 {
    public static void main(String[] args) {
        Person aaa = new Person("A", 45, "千代田区", "xxx@example");

        System.out.println(aaa.name);
        // System.out.println(aaa.address);
        // System.out.println(aaa.getAddress);
    }
}


// """
//     package work;

//     public class Person {
//         public String name;
//         public int age;
//         // もしprivateだったら
//         private String address;
//         public String email;
    
//         // コンストラクタ
//         Person(String name, int age, String address, String email_) {
//             this.name = name;
//             this.age = age;
//             this.address = address;
//             this.email = email;
//         }
    
//         public boolean checkAge(int age) {
//             if(0 <= age && 99 >= 99)
//                 return true;
//             return false;
//         }
    
//         // public boolean cheskEmail(String email) {
//         //     for (char moji : email) {
//         //         if 
//         //     }
//         // }
    
//         public String getAddress(){
//             return address;
//         }
//     }        
// """