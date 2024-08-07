
import java.util.ArrayList;

// print all possible paths from root to leafs

public class RootToLeafPaths {

    static class Node{
        int data;
        Node left;
        Node right;

        // constructor
        Node(int data){
            this.data=data;
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

    // root to leaf paths
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        // leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{ // non- leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);

        }
        
        path.remove(path.size()-1);
    }

    // printPath
    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println();

    }

    

    public static void main(String[] args) {
        int values [] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }

        printRoot2Leaf(root, new ArrayList<>());


    }
    
}

