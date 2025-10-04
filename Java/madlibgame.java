import java.util.Scanner;

public class madlibgame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective1 :"  );
        adjective1= scanner.nextLine();
        System.out.print("Enter the noun1 :" );
        noun1 = scanner.nextLine();
        System.out.print("Enter the adjective2 :");
        adjective2 = scanner.nextLine();
        System.out.print("Enter the verb1 :");
        verb1 = scanner.nextLine();
        System.out.print("Enter the adjective3 :");
        adjective3 = scanner.nextLine();



        System.out.println("Today I went to a " + adjective1 + "zoo.");
        System.out.println("I also saw that monkey was "+ noun1+ "on the table");
        System.out.println("Afterwards monkey was "+ adjective2+ "Sleeping with their friends");
        System.out.println("The Story ends here .... on the " + verb1+ "note");
        System.out.println("How much you like this (lol-highest/lol1-lowest): " + adjective3);

        scanner.close();

    }
}
