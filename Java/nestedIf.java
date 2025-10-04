public class nestedIf {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get the Senior 20% discount on the ticket");
                System.out.println("You get the Studemt 10% discount on the ticket");
                price *= 0.7;
            }
            else{
                System.out.println("You get the Student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            System.out.println("Your didn't get any discount!! Sorry for that!");
        }   
        System.out.println("Your Total amount for the ticket is : $" + price);
    }
}
