public class SearchBST {

    static class Node{
        int data;
        Node left;
        Node right;

        // constructor
        Node(int data){
            this.data=data;
            // left and right by default null
        }
    }

    public static Node insertNode(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            // left subtree insert
            root.left = insertNode(root.left, val);
        }else{
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    // search key in BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data >key){
            // left subtree
            return search(root.left, key);
        }

        else if(root.data == key){
            return true;
        }

        else // root.data < key
        {
            return search(root.right, key);
        }
    }
    

    public static void main(String[] args) {
        int values [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }

        if(search(root, 1)){
            // true
            System.out.println(" Found");
        }
        else{
            System.out.println("Not Found");
        }

        

    }
    
}