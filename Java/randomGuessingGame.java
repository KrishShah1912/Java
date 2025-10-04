import java.util.Random;
import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class randomGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int randomNum = random.nextInt(1,11);

        System.out.println("Number guessing game");
        System.out.println("Guess a number betweeen 1-10");


        do{
            System.out.print("Enter a Guess : ");
            guess = scanner.nextInt();
            attemps++;

            if(guess< randomNum){
                System.out.println("Too Low!! Try Again!");
            }

            else if(guess < randomNum){
                System.out.println("Too High!! Try Again");
            }

            else{
                System.out.println("The Number is " + randomNum);
                System.out.println("# of attemps " + attemps);
            }
        }while(guess != randomNum);


        System.out.print("You won!!");

    }
}
