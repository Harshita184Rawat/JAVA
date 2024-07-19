// import ArrayList and Collections Class
import java.util.*;
// import java.beans.JavaBean.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        // Declaring ArrayLists
        ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<Boolean> list2 = new ArrayList<Boolean>();

        // adding elements
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(2);

        System.out.println(list);
        
        // get elements
        
        int element0 = list.get(0);
        System.out.println(element0);
        
        int element1 = list.get(1);
        System.out.println(element1);
        
        // modify | add elements in between
        list.add(1,1); // idx , element
        list.add(2,10);
        
        System.out.println(list);
        
        // set element | changing element at particular idx
        list.set(0, 10);
        list.set(1,9);
        System.out.println(list);
        
        // delete element
        list.remove(2);
        list.remove(4);
        System.out.println(list);
        
        // size | no. of elements in ArrayList
        int n = list.size();
        System.out.println("Size of ArrayList is " + n );
        
        // loops
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        
        // sort ArrayList | default ascending order 
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
        
        
        

    }
}
