import java.util.Scanner;

public class Lopps {
    public static void main(String[] args) {
       // if statements : perform a block of code if it's condition is true

    Scanner scanner = new Scanner(System.in);

    int age;

    System.out.println("Enter your current age :");
    age = scanner.nextInt();

    if(age>=18){
        System.out.println("You are adult");
    }
    else if(age==0){
        System.out.println("You are just born yet!!!");
    }

    else if(age<0){
        System.out.println("Enter valid age ...... !");
    }

    else{
        System.out.println("You are a child !!!!");
    }

    scanner.close();
    }
}   
