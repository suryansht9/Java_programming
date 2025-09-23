// Example program with static variable, method, and block
public class staticexample {

    int num = 25;                     // Instance variable
    static String language = "Java";  // Static variable

    // Static block
    static {
        System.out.println("Welcome to the StaticExample program!");
        System.out.println("Static block executed before main()");
    }

    // Static method
    static void greet(String user) {
        System.out.println("Hello, " + user + "! You are learning " + language);
    }

    public static void main(String[] args) {
        // Creating object
        StaticExample obj = new StaticExample();

        // Accessing instance variable
        System.out.println("Instance variable num = " + obj.num);

        // Accessing static variable
        System.out.println("Static variable language = " + StaticExample.language);

        // Calling static method
        StaticExample.greet("Amit");
    }
}
