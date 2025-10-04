import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        // Substring() = A method used to extract a portion of the string
        // string.substring(start,end)

        // String email = "krishshah1234@gmail.com";
        // String username = email.substring(0,6);
        // String domain = email.substring(14, 23);

        // System.out.println(username);
        // System.out.println("Your domain name is : " + domain);

        String email;
        String domain;
        String username;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email :");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }

    }
}
