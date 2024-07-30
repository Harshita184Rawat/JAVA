// Queue using java collection framework
import java.util.*;

public class QueueUsingCollectionF {
    public static void main(String[] args) {

        // Queue  is Interface here, Implementation using LinkedList class
        
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.peek();
        q.remove();
        System.out.println(q.isEmpty());

        // Queue using ArrayDeque class
        Queue<Integer> q2 = new ArrayDeque<>();

        q2.add(1);
        q2.add(2);
        q2.peek();
        q2.remove();
        q2.remove();
        System.out.println(q2.isEmpty());
    }
    
}
