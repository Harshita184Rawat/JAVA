// Program to reverse a linked list in O(n) time complexity and O(N) space complexity

public class List {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =null;
        }
    }

    // addLast 
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
      
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // addFirst 
    public void addFirst(int data){
        Node newNode  = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // print list 
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        List lList  = new List();

        lList.addLast(1);
        lList.addLast(2);
        lList.addLast(3);
        lList.addLast(4);
        lList.addLast(5 );

        lList.printList();

        // reverse list 
        List revList = new List();

        Node curNode = lList.head;
    
        while(curNode != null){
            revList.addFirst(curNode.data);
            curNode = curNode.next;
        }
        
        revList.printList();
    }
}
