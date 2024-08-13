// Find Itinerary from tickets

import java.util.*;


public class ItineraryFromTickets {

    public static String getStart(HashMap <String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        // in tickMap => key -key : val -> tickMap.get(key)

        //In revMap
        for(String key: tick.keySet()){
            revMap.put(tick.get(key), key);
        }

       

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
             System.out.println(key);

                return key; // start
            }
        }

        return null; 
    
}  
    public static void main(String[] args) {
        HashMap<String, String> tickMap = new HashMap<>();

        // Tickets
        tickMap.put("chennai", "Bengaluru");
        tickMap.put("Mumbai","Delhi");
        tickMap.put("Goa", "Chennai");tickMap.put("Delhi", "Goa");

        String start = getStart(tickMap);

        while(tickMap.containsKey(start)){
            System.out.println(start);
            start = tickMap.get(start); 
        }

        System.out.println(start);
    }
}
