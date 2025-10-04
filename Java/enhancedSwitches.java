import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statement 
        // (Java14) feature

        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.print("Enter the day : ");
        day = scanner.nextLine();
    
        switch(day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }
    }
}