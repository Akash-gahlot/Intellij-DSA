package LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;
    DoublyLinkedList(){
        this.size=0;
    }

    //Insertion in doublyLinkedList
    public void insertInList(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;


    }
    public void insertLast(int val){
        Node node=new Node(val);
        tail.next=node;
        node.prev=tail;
        node.next=null;
        tail=node;
        System.out.println(tail.val);

    }
    public void insertionAtIndex(int val,int index){
        if(index==0){
            insertInList(val);
        }
        else if(index==size){
            insertLast(val);
        }
        else{
            Node newnode=new Node(val);
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node temp2=temp.next;
            temp.next=newnode;
            newnode.prev=temp;
            newnode.next=temp2;
            temp.next.prev=newnode;
        }
    }
    public void diplayList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("LIST END's");

        /*System.out.println("Tail node :"+tail.val);
        System.out.println("Head Node :"+head.val);*/
    }

public void reverseDisplay(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
    System.out.println("Start");
    System.out.println(size);
}

   class Node{
       int val;
       Node next;
       Node prev;

       Node(){

       }

       Node(int value){
           this.val=value;

       }
       Node(int value,Node Next,Node previ){
           this.val=value;
           this.next=Next;
           this.prev=previ;

       }
   }

}
