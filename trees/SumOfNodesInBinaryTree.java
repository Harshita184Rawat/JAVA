// To count sum of nodes in binary tree

public class SumOfNodesInBinaryTree {
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


    // count no. of nodes in binary tree : O(n) time complexityt
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);

        return leftNodes + rightNodes + root.data;
    }


    public static void main(String[] args) {

        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builTree(nodes);
        // if tree is build correctly the value of the root will be node[0] i.e 1
        // System.out.println(root.data);       
        System.out.println();
       System.out.println("Sum of Nodes : "+sumOfNodes(root));
        
    }

    
    
}
