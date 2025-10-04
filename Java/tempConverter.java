import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature :");
        temp = scanner.nextDouble();

        System.out.print("Convert the celcius or fahrenheit ? (C or F) :");
        unit = scanner.next().toUpperCase();

        // (Condition) ? true : false

        newtemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5/9) + 32;

        System.out.println(newtemp);

        scanner.close();
    }
}
