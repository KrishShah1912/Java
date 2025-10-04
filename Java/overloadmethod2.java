public class overloadmethod2 {
    public static void main(String[] args) {
        String pizza = bakePizza("flat bread ");
        System.out.println(pizza);

        String x = bakeBread("Soft bread ");
        System.out.println(x);

        
    }
    static String bakePizza(String bread){
        return bread + "pizza";
    }
    static String bakeBread(String cheese){
        return cheese + "pizza";
    }
}
