import java.util.Scanner;

public class weightConCalc {
    public static void main(String[] args) {
        
        // Weigth conversion programm
        Scanner Scanner = new Scanner(System.in);

        double weigth;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose one of the option : ");
        choice = Scanner.nextInt();

        if(choice ==1){
            System.out.print("Enter the weight in lbs : ");
            weigth = Scanner.nextDouble();
            newWeight = weigth * 0.453592;
            System.out.println("The new weight in the kgs is :" + newWeight);
        }
        else if(choice==2){
            System.out.print("Enter the weight in kgs :");
            weigth = Scanner.nextDouble();
            newWeight = weigth * 2.20462;
            System.out.println("The new weight in the lbs is :" + newWeight);
        }
        else{
            System.out.println("Enter the valid choice number for the usage!!!");
        }
        
        System.out.println("Thanks for using this program !!!");

        Scanner.close();
    }
}
