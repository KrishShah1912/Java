import java.util.Scanner;

public class main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name:");
            String name = scanner.nextLine();

            System.out.print("Enter your Age : ");
            int Age = scanner.nextInt();

            System.out.print("What is your academic GPA:");
            double gpa = scanner.nextDouble();

            System.out.print("You passed your final exam :");
            boolean fe = scanner.nextBoolean();

            System.out.println("Hello " + name);
            scanner.close();

            System.out.println("Your Current Age is :" + Age);
            scanner.close();

            System.out.println("Your Current GPA is : " + gpa);
            scanner.close();

            System.out.println("Final Exam Status (true/false): " + fe);
            scanner.close();

            if(fe){
                System.out.println("Congratulation!!!");
            }
            else{
                System.out.println("Better Luck Next time ..... Oppps Sorry for that!");
            }
    }
}