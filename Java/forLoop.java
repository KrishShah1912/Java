import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        System.out.print("Enter how many time you need to the loop :");
        int max = scanner.nextInt();

        for(i = 0; i<=max ; i++){
            System.out.println(i);
        }

        scanner.close();
    }    
}
