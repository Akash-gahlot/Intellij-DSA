package LinkedList.Problems;

public class ReversLinkedList {

    Node head;
    Node tail;
    int size;
    ReversLinkedList(){
        this.size=0;
    }

    public void insertnode(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=node;
        }
        size+=1;

    }

    public void displaylinkedlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }

        System.out.print("END");

    }


     class Node {
         int val;
         Node next;

         Node(){

         }

    Node(int value){
        this.val=value;
    }
    Node(int value,Node next){
        this.val=value;
        this.next=next;
    }
}

    public static void main(String[] args) {
        ReversLinkedList list1=new ReversLinkedList();
        list1.insertnode(1);
        list1.insertnode(2);
        list1.insertnode(3);


        //display list
        list1.displaylinkedlist();
    }
}

