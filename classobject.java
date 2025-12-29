class student{
    String name = "John";
    int age = 20;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public class classobject{
        public static void main(String[] args) {
            student obj=new student();
            obj.display();
        }
    }}