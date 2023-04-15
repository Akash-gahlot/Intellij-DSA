package BinaryTree;

public class tree {

    Node root;
    int size;

    //to create root node
    public void root_node(int val){
        Node node=new Node(val);
        root=node;
        size+=1;
    }

    //to add node in left node
    public void left_node(int val){
        Node node=new Node(val);
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        temp.left=node;

    }
    //to add node in right node
    public void right_side(int val){
        Node node=new Node(val);
        Node temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right=node;
    }
    //display nodes in pre order
    public void display_node(){
        Node temp=root;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.left;
        }
    }

    public void build_tree(Node node){
        System.out.print(node.data);

        if(node.data==-1){
            return;
        }
        else{

        }
    }


    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
           this.data=val;
             this.left=null;
             this.right=null;
        }

    }

    public static void main(String[] args) {
//        tree root=new tree();
//        root.root_node(10);
//       root.left_node(9);
//       root.left_node(8);
//       root.left_node(7);
//       root.display_node();
    }
}
