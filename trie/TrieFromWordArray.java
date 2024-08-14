public class TrieFromWordArray {

    static class Node {
        Node[] children;
        boolean endOfWord;

        // constructor
        public Node() {
            children = new Node[26]; // array size [a-z]
            endOfWord = false;
        }
    }

    static Node root = new Node();

    // insert function
    public static void insert(String word) { // O(L) : L = largest word 
        Node current = root; // use a temporary node instead of updating root
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

    // search word/key
    public static boolean search(String key) {  // O(L) : L = key length
        Node current = root; // use a temporary node instead of updating root
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if (current.children[idx] == null) {
                // character not present
                return false;
            }

            // move to the next node
            current = current.children[idx];
        }

        // check if it's actually the end of a word
        return current.endOfWord;
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("their")); // true
        System.out.println(search("thor"));  // false
        System.out.println(search("an"));    // false
        System.out.println(search("any"));   // true
    }
}
