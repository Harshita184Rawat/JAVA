


public class LL {
    Node head;
    // declaring node
    class Node{
        String data;
        Node next;

        // constructor of Node class 
        Node(String data){
            this.data=data;
            this.next = null;
        }
    }

        // add - first
        public void addFirst(String data){
            Node newNode = new Node(data);

            // empty list
            if(head == null){
                head = newNode;
                return;

            }

            newNode.next = head;
            head = newNode;

        }

        // add - last
        public void addLast(String data){
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

        // Print LinkedList
        public void printList(){
            if(head == null){
                System.out.println("list is empty");
            }
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data +" -> ");
                currNode = currNode.next; 

            }

            System.out.println("NULL");

        }

        public static void main(String[] args) {
            // object of the the class itself
            LL list = new LL();
            list.addFirst("a");
            list.addFirst("is");
            list.printList();

            list.addLast("list");
            list.printList();

            list.addFirst("this");
            list.printList();

    }
    
}
