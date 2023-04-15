package LinkedList;

public class CircularLinkedList {

    Node head;
    Node tail;

    CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void Insertion(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.next=head;
            tail=node;
        }


    }

    public void Nodedeletion(int val){
        Node temp=head;
        if(temp.val==val){
            tail.next=head.next;
            head=head.next;

        }
        else {
            while (temp.next.val != val) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void displayList() {
        Node temp = head;
        do {
            System.out.print(temp.val + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("END");
    }

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }

    }
}
