public class overloadmethod {
    public static void main(String[] args) {
        // Overload method = methods that share the same name 
                            //  but different parameters
                            // Signature = name + parameters
        System.out.println(add(5,6));
        System.out.println(add(4,5,6));
        System.out.println(add(1,2,3,4));
    }
    static double add(double a , double b){
        return a+b;
    } 
    static double add(double a , double b, double c){
        return a+b+c;
    } 
    static double add(double a , double b, double c, double d){
        return a+b+c+d;
    } 
}
