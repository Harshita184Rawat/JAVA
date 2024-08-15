// find the total number of unique subtrings of the given string

public class CountUniqueSubstrings {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26]; // array size [a-z]
            endOfWord = false;
        }
    }

    static Node root = new Node();

    // insert function
    public static void insert(String word) {
        Node current = root; 
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (current.children[idx] == null) {
                // add new node
                current.children[idx] = new Node();
            }

            // move to the next node
            current = current.children[idx];
        }
        // mark the end of the word
        current.endOfWord = true;
    }


    public static int  countNode(Node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            count += countNode(root.children[i]); // count nodes of sub tree of each array node
        }

        return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";

        // Step 1 and 2
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i); // suffix
            insert(suffix);
        }
        
        System.out.println(countNode(root));
    }
}


