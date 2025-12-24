class a{
    int value;
    public void show(){
        System.out.println("Value of parent class is  "+value);
    }}
class b extends a{
    int value;
    public void show(){
        System.out.println("Value of child class is  "+value);
        System.out.println("Value of parent class is  "+super.value);}
}

public class superprog {
    public static void main(String[] args) {
        b obj=new b();
        obj.value=20;
        obj.show();
        
    }
}
