import java.util.Scanner;

public class methods2 {
    public static void main(String[] args) {
        // method for squaring a number 

    double z = square(3);
    System.out.println(z);

    double x = cube(4);
    System.out.println(x);

    Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        if(agecheck(age)){
            System.out.println("You can sign the doucments");
        }
        else{
            System.out.println("You need to 18+ for signing the property lease");
        }
        
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }

    static boolean agecheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
