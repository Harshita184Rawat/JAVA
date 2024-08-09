import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 30);

        System.out.println(map);

        // if pair already exits - updates the value of previously inserted pair
        map.put("India",160);

        // Search 
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("key is not prsent in the map");
        }

        System.out.println(map.containsValue(30)
                        );

        // to get value corresponding to a key
        System.out.println(map.get("India")); // key exists in map
        System.out.println(map.get("Indonesia")); // if key doesn't exits

        // iterate over map
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        // Another method of iteration : using keySet()
        Set<String> keys =  map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }


        // Remove
        map.remove("China");
        System.out.println(map);


    }
}
