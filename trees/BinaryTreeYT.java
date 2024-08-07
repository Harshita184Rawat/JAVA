// binary tree implementation and traversal techniques

import java.util.*;

public class BinaryTreeYT {
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

     // preorder traversal : o(n) time complexity
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    // inorder travesal : 
    public static void inorder(Node root){
        if(root == null){
                return;
            }
        
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);

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

    // level order traversal
    public static void levelOrder(Node root){
        Queue<Node> q  = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }

                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }


    }


    public static void main(String[] args) {

        // preorder 
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builTree(nodes);
        // if tree is build correctly the value of the root will be node[0] i.e 1
        // System.out.println(root.data);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println();
       levelOrder(root);
        
    }

    
    
}
