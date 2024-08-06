public class DeleteNodeBST {

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

    // Delete Node 
    public static Node delete(Node root, int val){

        // find the node(val) to delete
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }

        else{ // root.data == val

            // case 1
            if(root.left == null && root.right ==null){
                return null;
            }

            //case 2 
            if(root.left == null){
                return root.right;

            }
            else  if(root.right == null){
                return root.left;
            }

            // case 3
            Node inorderS = inorderSuccessor(root.right);
            root.data = inorderS.data;
            root.right = delete(root.right, inorderS.data);
            
        }

        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
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

        // single child
        delete(root, 4);
        inorder(root);
        System.out.println();

        delete(root, 10);
        inorder(root);
        System.out.println();

        // two child node delete
        delete(root, 5);
        inorder(root);
        System.out.println();


    }
    
}

