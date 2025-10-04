public class varargs {
    public static void main(String[] args) {
        
        // varargs = allow a method to accept a varying # of arguments makes method more flexible,
                    //  no need for overload method java will pack arguments in the array.

        System.out.println(add(1,2,3,4));
        System.out.println(avg(1,2,3,4));
    }

    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum = sum + number;
        }
        return sum;
    }

    static double avg(int... numbers1){
        double sum1 = 0;

        for(double number1 : numbers1){
            sum1 = sum1 + number1;
        }
        return sum1 / numbers1.length;
    }
}