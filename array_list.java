import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Oracle");
        list.add("Internship");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
