package work;
import java.util.ArrayList;

class Q9x13 {

    public static ArrayList<Integer>check(int[] list) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        
        for (int i : list){
            if (i%2 != 0)
                odd.add(i);
        }
        return odd;
    }

    public static void main(String[] args) {
        int[] list = {4, 9, 24, 45, 69, 22, 44, 51, 90, 78};
        ArrayList<Integer> result = check(list);
        for (int i : result)
        System.out.println(i);
    }

}