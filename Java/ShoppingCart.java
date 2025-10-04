// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[]args){
        
        // Shopping Cart Program
        Scanner scanner = new Scanner(System.in);
        
        String item;
        double price;
        int quatity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to purchase? : ");
        item = scanner.nextLine();

        System.out.println("What is the price of each item? :");
        price = scanner.nextDouble();

        System.out.println("How many would you like to have? :");
        quatity = scanner.nextInt();

        total = price * quatity;

        System.out.println("\nYout total bill for the complete purchase is : " + quatity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        scanner.close();

    }
}