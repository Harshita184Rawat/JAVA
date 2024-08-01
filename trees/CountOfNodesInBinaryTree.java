// To count no of nodes in given binary tree

public class CountOfNodesInBinaryTree {
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


    // postorder traversal
    public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
         System.out.print(root.data + " ");

    }


    // count no. of nodes in binary tree : O(n) time complexityt
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }


    public static void main(String[] args) {

        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builTree(nodes);
        // if tree is build correctly the value of the root will be node[0] i.e 1
        // System.out.println(root.data);

        postorder(root);
        System.out.println();
       System.out.println("No. of Nodes : "+countOfNodes(root));
        
    }

    
    
}
