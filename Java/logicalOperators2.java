import java.util.Scanner;

public class logicalOperators2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Username must be between 4-12 characters
        // Username must not contain spaces or underscores

        String Username;
        System.out.print("Enter the username :");
        Username = scanner.nextLine();

        if(Username.length()< 4 || Username.length()>12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(Username.contains(" ") || Username.contains("_")){
            System.out.println("Username must NOT contain underscores or spaces");
        }
        else{
            System.out.println("Welcome " + Username);
        }

        scanner.close();
    }
}
