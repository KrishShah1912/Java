import java.util.Random;

public class random {
    public static void main(String[] args) {
    
        Random random = new Random();
        int number;

        number = random.nextInt(1,6); 
        // (1,6)... include 1,2,3,4,5

        
        // I we don't add any upper bound or lower bound then the random number may be too big ....

        System.out.println("Your current random number is: " + number);
    }
}
