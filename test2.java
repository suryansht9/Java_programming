class outer{
    static int data=90;
    static class inner{
        void msg(){
            System.out.println("Data is :" +  data);
        }
    }
}
public class test2{
    public static void main(String[] args) {
        outer.inner obj = new outer.inner();
        obj.msg();
    }
}