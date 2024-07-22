public class LL {
    private int size;
    // constructor to initlaize size variable
    LL(){
        this.size = 0;
    }
    Node head;

    // declaring node
    class Node{
        String data;
        Node next;

        // constructor of Node class 
        Node(String data){
            this.data=data;
            this.next = null;
            // whenever new node is created
            size++;
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

        // delete first
        public void deleteFirst(){
            if(head == null){
                System.out.println("lisrt is empty");
            }

            head = head.next;
            size--;
        }

        // delete last
        public void deleteLast(){
            // empty linked list
             if(head == null){
                System.out.println("lisrt is empty");
            }
            
            size--;
            // only single element in linked list
            if(head.next == null){
                head = null;
            }

            // to get seconda last node and make it's next  = null
            Node secondLast = head;
            Node lastNode =  head.next;;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }

            secondLast.next=null;

             
        }


        public int getSize(){
            return size;
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

            list.deleteFirst();
            list.printList();

            list.deleteLast();
            list.printList();

            System.out.println("Size = " + list.getSize());

    }
    
}
