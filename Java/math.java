// import java.net.Socket;
import java.util.Scanner;

public class math {
 public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println(Math.PI);
    // It will print value of Pie
    System.out.println(Math.E);
    // It will print value of exponent 

    double result;
    result = Math.pow(5,3);
    System.out.println(result);

    double result1;
    result1 = Math.sqrt(9);
    System.out.println(result1);

    double result2;
    result2 = Math.round(3.1223344294824984);
    System.out.println(result2);


    double result4;
    result4 = Math.ceil(3.6);
    System.out.println(result4);

    double result5;
    result5 = Math.max(10,20);
    System.out.println(result5);

    double a;
    double b;
    double c;

    System.out.print("Enter the length of Side A : " );
    a = scanner.nextDouble();

    System.out.print("Enter the length of Side B :");
    b = scanner.nextDouble();

    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    System.out.print("The hypotenous (Side C) is : " + c);

    scanner.close();

 }   
}
