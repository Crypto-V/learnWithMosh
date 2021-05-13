import collections.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Peter", "e3"));
        customers.add(new Customer("Vasile", "e2"));
        customers.add(new Customer("George", "e1"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);


        //Testing Queue
        QueueDemo.show();

        //Testing set implementation
        System.out.println();
        SetDemo.show();

        //Testing Map
        System.out.println("Testing Maps");
        MapDemo.show();
    }

}
