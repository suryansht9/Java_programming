/*import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=a.next();
        System.out.println("helo dear" + name + "welcome to java programming");

    }
    
    
}
*/

import java.util.Scanner;
public class userinput{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=a.next();
        System.out.println("helo dear" + name + " welcome to java programming");
        System.out.println("Enter your age:");
        int age=a.nextInt();
        System.out.println("Your age is: " + age);
        System.out.println("please eneter your fav character ");
        char d=a.next().charAt(0);
        System.out.println("your fav character is: " + d);
    }
}