import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {

       // 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        // list1 : 1D ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(10);
        list1.add(5);
        list1.add(4);
        list1.add(9);

        // list2 : 1D ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);
        list2.add(3);
        list2.add(7);
        list2.add(6);

        // both the 1D lists(list1, list2) to the 2D list
        list.add(list1);
        list.add(list2);
        
        System.out.println(list);

    }
    
}
