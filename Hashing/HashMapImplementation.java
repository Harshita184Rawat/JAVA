// hashMap implementation using Array of linked list

import java.util.*;


public class HashMapImplementation {

    static class HashMap<K,V>{ // generics

        // linked list node class
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key  =  key;
                this.value = value;
            }
        }

        private int n; // no. of nodes
        private int N; // size of array or total buckets
        private LinkedList<Node> buckets[]; // N= buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                // create new linkedlist at every idx(bucket)
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int searchInLL(K key, int bidx){
            LinkedList<Node> ll = buckets[bidx];

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i; // di
                }
            }

            // if not exists
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            // create new linkedlist at each Bucket idx in new array
            for(int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }

            // tranfer node from old hashmap(array[N]) to new hashmap(array[N*3=2])
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j =0; j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }


        }
        
        private int hashFunction(K key){ 
            int bi = key.hashCode(); 
            // 12345..    -1-2-3...
            // 0<= bi <=N-1
            // %N ==> alwaya lies in 0 to N-1
            return Math.abs(bi)%N; 

        }

        public void put(K key, V value){
            int bidx = hashFunction(key); // bucket idx
            
            int di = searchInLL(key,bidx); // data idx i.e idx in LL

            if(di == -1){// key doesn't exists
                // add new node to bidx
                buckets[bidx].add(new Node(key, value));
                n++;
            } 
            else{ // key exists
                Node node = buckets[bidx].get(di);
                // update value
                node.value = value;

            }

            double lambda = (double)n/N;
            // k = 2.0
            if(lambda >2.0){
                // rehashing
                rehash();
            }

        }

        public V remove(K key){
            int bidx = hashFunction(key); // bucket idx
            
            int di = searchInLL(key,bidx); // data idx i.e idx in LL

            if(di == -1){// key doesn't exists
                return null;
            } 
            else{ // key exists
                Node node = buckets[bidx].remove(di); // remove of linkedlist
                // update value
                n--;
                return node.value;

            }
        }

        public V get(K key){
            int bidx = hashFunction(key); // bucket idx
            
            int di = searchInLL(key,bidx); // data idx i.e idx in LL

            if(di == -1){// key doesn't exists
                return null;
            } 
            else{ // key exists
                Node node = buckets[bidx].get(di);
                // update value
                return node.value;

            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i =0;i<buckets.length;i++){ // bidx
                LinkedList<Node> ll = buckets[i];
                for(int j =0; j<ll.size();j++){ // di
                    Node node =ll.get(j); 
                    keys.add(node.key);
                }
            }

            return keys;

        }

        public boolean isEmpty(){
            return n==0;
        }

        public boolean containsKey(K key){
            int bidx = hashFunction(key); // bucket idx
            
            int di = searchInLL(key,bidx); // data idx i.e idx in LL

            if(di == -1){// key doesn't exists
                return false;
            } 
            else{ // key exists
                return true;

            }
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 120);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));

        
    }
    
}
