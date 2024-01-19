package work;

class Q9x3 {

    public static void display(String str, int num) {
        for(int i=0; i<num; i++)
            System.out.println(str);
    }

    public static void main(String[] args) {
        display("Hello", 3);
        display("Good morning", 4);
        display("Good evening", 2);
    }

}