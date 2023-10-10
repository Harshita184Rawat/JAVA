import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictinaryMethods {
    public static void main(String[] args) {
        // creating a dictionary
        Dictionary dict = new Hashtable();

        // adding values in the dictionary
        dict.put(101, "Alwar");
        dict.put(102, "Ajmer");
        dict.put(103, "Beware");
        dict.put(104, "Bikaner");
        dict.put(105, "Churu");

        // print keys and corresponding values
        System.out.println(dict);

        // size od dictionary
        System.out.println("Size of dictionary is " + dict.size());

        // get value for a specific key
        System.out.println("Value at key 103: " + dict.get(103));

        // check is the dictinary empty
        System.out.println("Is the dictionary empty: " + dict.isEmpty());

        // to remove a specific key value pair
        System.out.println("The value reoved is: " + dict.remove(105));
        System.out.println(dict);

        // print dictionary values using elements() method
        // loop to iterate over the values stored in dictionary
        System.out.println("Dcitionary values: ");
        for (Enumeration enm = dict.elements(); enm.hasMoreElements();) {
            System.out.println(enm.nextElement());
        }

        // print dictionary keys using keys() method
        // loop to iterate over the keys stored in dictionary
        System.out.println("Dictonary Keys: ");
        for (Enumeration enm = dict.keys(); enm.hasMoreElements();) {
            System.out.println(enm.nextElement()); // nextElement()
        }

    }
}
