
import java.util.Stack;

public class QueueUsing2Stacks {

    static class Queue{

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add 
         public static void addQ(int data){
            while(!s1.isEmpty()){
                int top = s1.pop();
                s2.push(top);
            }

            s1.push(data);

            while(!s2.isEmpty()){
                int top = s2.pop();
                s1.push(top);
            }

        }

        // remove
         public static int removeQ(){
            if(s1.isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peekQ(){
        if(s1.isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return s1.peek();

    }

    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.addQ(1);
        q.addQ(2);
        q.addQ(3);

        while(!q.isEmpty()){
            System.out.println(q.peekQ());
            q.removeQ();
        }
        
    }
}
