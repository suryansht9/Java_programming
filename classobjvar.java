class student{
    String name="suryansh";
    int age=19;
    static int count=0;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

public class classobjvar{
    public static void main(String[] args) {
        student obj1=new student(); 
        student.count++;
        obj1.display();
        System.out.println("Number of student objects created: " + student.count);
    }
}
}