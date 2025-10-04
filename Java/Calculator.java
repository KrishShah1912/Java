import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operation;
        double result = 0;
        // Here we need to assign the result as zero .... after that only the code will work
        boolean validOperator = true;

        System.out.print("Enter the first number :");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+,-,*,/,^) :");
        operation = scanner.next().charAt(0);

        System.out.print("Enter the second number :");
        num2 = scanner.nextDouble();

        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Can't divide the number with zero");
                    validOperator = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.print("Invalid operator");
                validOperator = false;
            }
        }
        if(validOperator){
            System.out.print("Your output for the " + num1 + " and " + num2 + " is : " + result);
        }
        
        scanner.close();
    }
}
