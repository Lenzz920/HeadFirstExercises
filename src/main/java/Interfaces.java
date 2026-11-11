import java.util.ArrayList;
import java.util.List;

public class Interfaces implements someInterface{
    public void play() {
        System.out.println(4);
    }



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");

        int a = list.indexOf("yo");

        if (a != -1 ) {
            System.out.println(list.get(a));
        }
    }

}

