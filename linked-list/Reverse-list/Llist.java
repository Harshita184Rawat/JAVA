// Program to reverse a linked list in O(n) time complexity and o(1) space complexity
// using Iterative Approach


public class Llist {

    Node head;
    // declaring node
    class Node{
        int data;
        Node next;

        // constructor of Node class 
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }

    // add - last
    public void addLast(int data){
    Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }

        // traversing linkedList
        Node currNode = head;
        while(currNode.next!= null){
            currNode = currNode.next; 

        }

        // at last node 
        currNode.next = newNode;
    }

    // reverse function
    public void reverseIterate(){
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;

        head = prevNode;

        // print reversed linked list
        Node i = head;
    }
    
    //printl
    public void printl(){
        Node i = head;
       while(i !=null){
        System.out.print(i.data + "-->" );
        i=i.next;
       }
       System.out.println("NULL");
        
    }

    public static void main(String[] args) {

        Llist list = new Llist();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        
        System.out.println("Reversed List: ");
        list.reverseIterate();
        list.printl();
    } 
    
}
