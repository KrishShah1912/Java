import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.println("Enter how many size of array you need : ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        
        for(int i = 0; i<foods.length ; i++){
            System.out.print("Enter the food : ");
            foods[i] = scanner.nextLine();
         }

        // foods[0] = "pizza";
        // foods[1] = "hamburger";
        // foods[2] = "garlic";
        // foods[3] = "banana";
        // foods[4] = "toast";


        for(String food : foods){
            System.out.println(food);
        }
  
        // System.out.println(foods.length);
        scanner.close();
    }
}
