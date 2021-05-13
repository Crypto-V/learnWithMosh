package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
        //Java :Maps
        //Python : Dictionary
        //JavaScript : Object
        // var person = {name : "a"}
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        //big O notation O(n) - n number of list, list will have to ran depending on how many elements are in the list.
        for(var entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
