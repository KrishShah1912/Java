// import java.lang.classfile.attribute.SourceFileAttribute;

public class printf {
 public static void main(String[] args) {
    
    // Printf : is a method that is used o format output

    // %[flags][width][.precision][specifier.character]
    
    String name = "Spogeball";
    char firstletter = 'S';
    int age = 30;
    double height = 60.5;
    boolean isEmployed = true;

    // + = Output plus
    // , = comma grouping seprator
    // ( = negative numbers are enclosed in ()
    // spcae = display a minus if neagtive, space if positive

    System.out.printf("Hello %s\n" , name);
    System.out.printf("Your name starts with a letter %c\n" ,firstletter);
    System.out.printf("Your age is %d\n" , age);
    System.out.printf("Your height is %f\n" , height);
    System.out.printf("You are employed:%b\n" , isEmployed);

    System.out.printf("%s is %d years old\n", name , age);


    double price1 = 9.93349;
    double price2 = 100.14945;
    double price3 = -54.0231;

    System.out.printf("%(.2f\n" ,price1);
    System.out.printf("%(.2f\n" ,price2);
    System.out.printf("%(.2f\n " ,price3);

    // 0 = zero padding
    // number = right justified padding
    // negative number = left justified padding

    int a = 1;
    System.out.printf("%04d\n", a);
    System.out.printf("%4d\n", a);
 }   
}