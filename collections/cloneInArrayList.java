package collections;

import java.util.ArrayList;

public class cloneInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr  = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        ArrayList<Integer> arr2 =  (ArrayList<Integer>) arr.clone(); 
        System.out.println(arr);
        arr2.remove(1);
        System.out.println(arr);
        System.out.println(arr2);
    }
    
}
