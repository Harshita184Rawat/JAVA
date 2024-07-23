// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

public class ListSearch {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    
    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node curNode = head;
        while(curNode.next !=null){
            curNode = curNode.next;
        }

        curNode.next = newNode;

    }

    public void listPrint(Node head){
        if(head == null){
            System.out.println("List is empty");
        }

        Node curNode = head;

        while(curNode != null){
            System.out.print(curNode.data +" ->");
            curNode = curNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListSearch list = new ListSearch();

        // 1, 5, 7, 3 , 8, 2, 3
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);

        list.listPrint(list.head);

        // search
        Node i = list.head;
        int idx = -1;
        while(i != null){
            idx ++;
            if(i.data == 7){
                System.out.println("Index of 7 is : " + idx );
                break;
            }
            i = i.next;
        }


    }

    
    
}
