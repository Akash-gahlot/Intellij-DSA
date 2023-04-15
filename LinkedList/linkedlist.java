package LinkedList;

public class linkedlist {

    private Node head;
    private Node tail;    //linked list properties
    private int size;

    public linkedlist(){
        this.size=0;
    }

    public void insertfirnode(int val){     //insert node
        Node node=new Node(val); //create a new node with some value
        node.next=head;         //node next should reference head value;
        head=node;              //head will have now new node
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertatlast(int val){
        if(tail==null){
            insertfirnode(val);        //insert node at last position
        }
        else{
            Node node=new Node(val);
            tail.next=node;
            tail=node;
    }
    size+=1;
    }

    public void insertAtIndex(int val,int index){
        if(index==0){
            insertfirnode(val);   //if linked list is already empty then call firstinsert method
            return;
        }
        if(index==size){
            insertatlast(val);  //if index position is equals to size of list then add new node at last;
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){   //traverse upto index position and add there .
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;
    }

    public void deletefirstnode(){
        head=head.next;//to delete first node.
        size-=1;
    }
   public void deletelast(){
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        temp.next=null;    //delete  last node
        tail=temp;
        size-=1;
   }
   public void deletefromindex(int position){
        Node prev=head;
        for(int i=1;i<position-1;i++){
            prev= prev.next;
        }                  //deleting from particular index value
        prev.next=prev.next.next;
        size-=1;

   }

   public void findelement(int pos){
        Node temp=head;
        for(int i=1;i<pos;i++){        //find node with particular index
            temp=temp.next;
        }
       System.out.println(temp.val);
   }

   public void findmiddlenode(){
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count+=1;
        }
        Node temp2=head;
        for (int i = 0; i <count / 2; i++) {
                temp2 = temp2.next;
            }
            System.out.println(temp2.val);


   }

   public void reverseLinkedList(){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
       System.out.println(prev.val);
   }

   public void RangeReverse(int m,int n){
        Node dummmynode=new Node(0,head);
        Node prev=dummmynode;
        for(int i=1;i<m;i++){
            prev=prev.next;
        }
       Node curr=prev.next;
        for(int i=0;i<n-m;i++){
            Node temp=curr.next;
            curr.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;
        }
       System.out.println(prev.next.val);

   }

    public void displaynodes(){
        Node temp=head;
        while(temp!=null){            //display all nodes with the help of temp variables without affecting the head and tail value
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    private class Node{
        private int val;
        private Node next;      //Node Properties

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }


    }

}
