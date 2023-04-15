package LinkedList;

public class main {
    public static void main(String[] args) {
        /*linkedlist list1=new linkedlist();
        list1.insertfirnode(1);
        list1.insertfirnode(2);
        list1.insertfirnode(3);
        list1.insertfirnode(4);
        list1.insertfirnode(5);
        list1.insertfirnode(6);
       //list1.insertfirnode(7);

        //list1.displaynodes();

        //insert node at last;
        //list1.insertatlast(6);  //6 will get added after 1

        //list1.displaynodes();

        //list1.insertAtIndex(10,3);
        //list1.deletefirstnode(); //deleting first node
        //list1.deletelast();
       // list1.displaynodes();
        //list1.deletefromindex(3);

        //list1.findelement(3);
        //list1.findmiddlenode();
        list1.displaynodes();
        //list1.reverseLinkedList();
       list1.RangeReverse(2,5);*/
  /////Singly Linked list Ends

       /* DoublyLinkedList list1=new DoublyLinkedList();
        list1.insertInList(6);
        list1.insertInList(5);
        list1.insertInList(4);
        list1.insertInList(3);
        list1.insertInList(2);
        list1.insertInList(1);
        //list1.diplayList();
        //list1.reverseDisplay();
        //list1.insertLast(7);

        list1.diplayList();
        list1.insertionAtIndex(0,5);
        list1.diplayList();*/

///Double Linked List Ends here

        CircularLinkedList list1=new CircularLinkedList();
        list1.Insertion(1);
        list1.Insertion(2);
        list1.Insertion(3);
        list1.Insertion(4);
        list1.Insertion(5);

        list1.displayList();  //Before Deletion
        list1.Nodedeletion(2);
        list1.displayList();  //After Deletion
///circular list ends here
        


    }
}
