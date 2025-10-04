public class methods {
    public static void main(String[] args) {
        // method = a block of resusable code thaat is executed when call()

        String name = "Spongebob";
        int age = 22;

        happy(age, name);
        happy(age, name);
        happy(age, name);
    }
    static void happy(int age, String name){
        
                System.out.println("Happy birthday to " + name);
                System.out.println("May god bless you!!");
                System.out.println("You are " + age + " years old!!");
                System.out.println("Happy and great birthday to you!!\n");
    }
}
