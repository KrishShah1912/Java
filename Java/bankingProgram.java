import java.util.Scanner;

public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.println("Enter your choice(1-4) : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }
        System.out.println("*******************");
        System.out.println("Thanks! Have a Nice Day!!");
        System.out.println("*******************");

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.println("*******************");
        System.out.printf("$%f\n", balance);
    }
    static double deposit(){
        double amount;

        System.out.print("Enter an amount that you need to deposit : ");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;

        System.out.println("Enter amount to be withdrawn : ");
        amount = scanner.nextDouble();

        if(amount> balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else if(amount<0){
            System.out.println("Amount can't be nagative");
            return 0;
        }
        else{
            return amount;
        }
    } 
}
