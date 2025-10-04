// import java.lang.classfile.instruction.StackInstruction;

public class variablescope {

    static int x=3; //Class variable
    public static void main(String[] args) {
        // Varibale Scope = where a variable can be accessed

        int x = 1; // Local varibale 
        System.out.println(x);
        doSomething();

    }
    static void doSomething(){
        int x = 2; // Local variable 
        System.out.println(x);
    }
}
