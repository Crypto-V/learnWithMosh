package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"A","B");

        System.out.println(list.get(0));

    }
}
