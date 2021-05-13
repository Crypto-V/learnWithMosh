package collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        //No order only unique value.
        //Bellow we are creating an array list that will have the duplicates
        // and we will use set to remove the duplicates.

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);

        //Set operations
        System.out.println("\nHere are printed operations with set examples:");
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b","c","d"));

        System.out.println("Initial sets:\n"+set1+"\n"+set2);

        //In order to see the proper use of the operation you have to uncomment one operation on the
        // time so it will not change the original values.

        // UNION
//        System.out.println("\n#Union#");
//        set1.addAll(set2);
//        System.out.println(set1);

        //Intersection
//        System.out.println("\n#Intersection#");
//        set1.retainAll(set2);
//        System.out.println(set1);

        //Difference
//        System.out.println("\n#Difference#");
//        set1.removeAll(set2);
//        System.out.println(set1);

    }
}
