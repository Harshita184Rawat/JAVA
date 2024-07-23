import java.util.*;

public class ListUsingCollectionFramework {    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // addFirst function
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        // addLast function
        list.addLast("a");
        list.add("Linked-list");
        System.out.println(list);

        // add function - by default last
        list.add("!!");
        System.out.println(list);

        //Size function
        int listSize = list.size();
        System.out.println("List size = "+listSize);

        // printing list data/ elements
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + "-->");
        }
        System.out.println("null");

        // search : get ith element and search

        // delete | remove 
        list.removeFirst(); // remove first node 
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(0);

    }

}
