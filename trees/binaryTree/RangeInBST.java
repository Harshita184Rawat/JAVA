// print all the numbers present in the BST that lies the given range

public class RangeInBST {

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

    // range function
    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        // case 1
        if(root.data >= X && root.data <=Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        // case 2
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }
        // case 3
        else{
            printInRange(root.right, X, Y);
        }

    }

    // inorder 
    public static void inorder(Node root){
        if(root == null){
            return;
        } 

        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    

    public static void main(String[] args) {
        int values [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }

        inorder(root);
        System.out.println();

       printInRange(root, 6, 10);


    }
    
}

