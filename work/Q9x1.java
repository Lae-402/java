package work;
import java.util.Scanner;

class Q9x1 {

    public static void display(String school, String name) {
        System.out.println("学校名：" + school);
        System.out.println("名前：" + name);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-jis");
        System.out.println("学校名を入力してください");
        String school = stdIn.next();
        System.out.println("名前を入力してください");
        String name = stdIn.next();
        
        display(school, name);
    }
}