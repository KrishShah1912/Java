// import java.lang.reflect.Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] fruits = {"apple" , "banana" , "carrot" , "coconut"};

        Arrays.sort(fruits);

        Arrays.fill(fruits, "pineapple");
        
        System.out.println(fruits);


        // for(String fruit : fruits){
        //     System.out.println(fruit);
        // }
    }
}
