import java.util.Scanner;
public class ternaryOperator {
 public static void main(String[] args) {
    // ternary operator ? = Return 1 of 2 values if a condition is true
    // Variable = (condition) ? ifTrue: ifFalse;
    
    int score;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your desired Score :");
    score = scanner.nextInt();

    String passOrfail = (score>=60) ? "Pass" : "Fail";

    System.out.println(passOrfail);
 }   
}
