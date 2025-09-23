class demo{
    static int value;
    static{
        System.out.println("static block is executed");
        value=900;
    }
}

public class staticblocks {
    public static void main(String[] args) {
        System.out.println(demo.value);
            }
        }
