// Approach 1 having O(n^2) time complexity

public class DiameterOfTree {
    // To find height  tree
    
    static class Node{
        int data;
        Node left;
        Node right;

        // constructor of node
        Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;

        }
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node builTree(int nodes[]){
            idx++;
            // return root node
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = builTree(nodes);
            newNode.right = builTree(nodes);
            
            return newNode;
            
        }
     } 
     // height
      public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;

        return myHeight;
     } 


    // Diameter 
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        // dia of let subtree
        int diam1 = diameter(root.left);

        // dia of right subtree
        int diam2 = diameter(root.right);

        int diam3 = height(root.left) + height(root.right) + 1;

        // dia will be max of diam1, diam2, diam

        return Math.max(diam3, Math.max(diam2, diam1));`````````````  

    }

    public static void main(String[] args) {

        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builTree(nodes);
        // if tree is build correctly the value of the root will be node[0] i.e 1
        // System.out.println(root.data);       
        System.out.println();
       System.out.println("Diameter of tree : "+diameter(root));
        
    }
}
