import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        int[] number = {1,3,4,643,12,87,32,51,78,4,5,55,6};
        Scanner scanner = new Scanner(System.in);
        int target;
        boolean isFound = false;


        System.out.print("Enter the number that you are looking for : ");
        target = scanner.nextInt();

        for(int i = 0 ; i < number .length ; i++){
            if(target == number[i]){
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("We didn't find our targeted element ");
        }
        
        scanner.close();
    }   
}
