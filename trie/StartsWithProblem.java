// create a function for a tri. Return true if a previouly inserted string word that has the prefix prefix and false otherwise

// words[] = {"apple", "app", "mango", "man", "woman"}
// prefix = "app" : TRUE
// prefix = "moon" : FALSE
public class StartsWithProblem {
    static class Node{
        Node[] children;
        boolean endOfWord;


        public Node(){
            children =  new Node[26];
            // initilaise each ith node in children array to null: if doesn't work use
            // for(int i=0;i<26;i++){
            //     children[i] =null;
            // }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    // insert or built trie
    public static  void insert(String word){
        Node curr = root;

            for(int i=0;i<word.length();i++)
            {
                // to cal indx of letter in children[]
                int idx = word.charAt(i) - 'a';

                if(curr.children[idx] == null){
                    curr.children[idx] =  new Node();
                }
                
                if(i==word.length()-1){
                    root.children[i].endOfWord = true;
                }
                curr = curr.children[idx];
                
            }
    }
  
    //search prefix in trie
    public static boolean searchPrefix(String prefix){

        Node curr = root;

        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "app", "mango", "man","woman"};
        String prefix = "moon";

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        
        System.out.println(searchPrefix(prefix));
    }
}
