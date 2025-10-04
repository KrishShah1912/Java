import java.util.Scanner;

public class CompoundInterestCalc {
    public static void main(String[] args) {
    
        // Compuond Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the Pricipal amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) :");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compouned per year :");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the # of the years : ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.print("The amount after " + years + " is " + amount + "$");

        scanner.close();

    }
}
