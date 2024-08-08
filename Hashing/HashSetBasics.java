import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        // ADD
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4); // will not be added


        // SEARCH - CONATAINS
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //  DELETE
        set.remove(1);

        if(set.contains(1)){
            System.out.println("does not contain 1");
        }

        // SIZE
        System.out.println("set size is : " + set.size());


        // PRINT SET
        System.out.println(set);

        // Iterator -1.  hasNext() - true or false
        //           2.  next()

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
