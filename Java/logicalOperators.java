public class logicalOperators {
    public static void main(String[] args) {

        // && = And
        // || = Or
        // ! = Not
        
        double temp = 25;
        boolean isSunny = true;

        if(temp <= 25 && temp >=0 && isSunny){
            System.out.println("The weather is good");
            System.out.println("It is Sunny outside");
        }
        else if(temp<=25 && temp >=0 && !isSunny){
            System.out.println("The weather is good");
            System.out.println("It is cloudy outside");
        }

        else if(temp>=25 || temp <0){
            System.out.println("The weather is bad");
        }
    }
}
