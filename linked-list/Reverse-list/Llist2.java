// Program to reverse a linked list in O(n) time complexity and o(1) space complexity
// using Recursion

public class Llist2 {
    Node head;

    // create Node
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // addLast function || to add elemets at the end of list
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;

        
    }


    // to Print the list
    public void printList(){
        Node currNode = head ;
        while(currNode !=null){
            
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Reverse using Recursion
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
           return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        // create list 
        Llist2 linkedlist = new Llist2();

        // add data in list
        linkedlist.addLast(1);
        linkedlist.addLast(2);
        linkedlist.addLast(3);
        linkedlist.addLast(4);
        linkedlist.addLast(5);

        // print original list
        System.out.println();
        System.out.print("Original Linked list: ");
        linkedlist.printList();

        // print Reversed list
        linkedlist.head = linkedlist.reverseRecursive(linkedlist.head);
        System.out.print("Reversed Linked list: ");
        linkedlist.printList();

    }

    
    
}
