package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("C");
        queue.add("a");
        queue.add("b");

        //poll is same as remove but in poll you get empty list if is empty but in remove you get the exception.

        var front = queue.poll();
        System.out.println(front);
        System.out.println(queue);
    }
}
