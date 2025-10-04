import java.util.Random;
import java.util.Scanner;

public class diceProgram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the Number of time dice to be rolled : ");
        numOfDice = scanner.nextInt();

        if(numOfDice>0){
            for(int i=0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("you rolled " + roll);
                total = total + roll;
            }
            System.out.println("Total " + total);
        }
        else{
            System.out.println("Number of the dice must be greater than zero");
        }

        scanner.close();
    }
    static void printDie(int roll){
        String dice1 = """
                -------
               |       |
               |   •   | 
               |       |
                -------
                """;
        String dice2 = """
                -------
               |•      |
               |       | 
               |      •|
                -------
                """;
        String dice3 = """
                -------
               |•      |
               |   •   | 
               |      •|
                -------
                """;
        String dice4 = """
                -------
               |•     •|
               |       | 
               |•     •|
                -------
                """;
        String dice5 = """
                -------
               |•     •|
               |   •   | 
               |•     •|
                -------
                """;
        String dice6 = """
                -------
               |•     •|
               |•     •| 
               |•     •|
                -------
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid Roll");
        }        
    }
    

}
