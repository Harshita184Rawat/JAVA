// Queue using Linked List

public class QueueUsingLinkedList {
    Node head  = null;
    Node tail = null;
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next  = null;
        }
    }
    // is empty
    public boolean isEmpty(){
        return head == null && tail == null;
    }

    // add - enqueue
    public void add(int data){
        Node newNode = new Node(data);
        // first el
        if(tail == null){
            tail = head = newNode;
        }
        
        tail.next = newNode;
        tail = newNode; 
    }

    // remove - dequeue
    public int remove(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        int front = head.data;
        // single le
        if(head == tail){
            tail = null;
        }
        head = head.next;

        return front;
    }

    // peek 
    public int peek(){
        int front = head.data;
        return front;
    }

    // print list
    public void printlist(){
        Node currNode = head;
        while(currNode.next != null){
            System.out.println(currNode.data) ;
            currNode = currNode.next;

        }
    }

    public static void main(String[] args) {

        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.head.data);
            q.remove();
        }
    }
}
