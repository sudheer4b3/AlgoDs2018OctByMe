package trees;

public class BinaryTree {

    public Node addNode(int data, Node head){


        Node tempHead = head;
        Node newNode = Node.newNode(data);

        if(head == null){
            head = newNode;
            return head;
        }

        Node parent = null;// holding previous element
        while(tempHead != null ){

            parent = tempHead;
            if(data < tempHead.data){

                tempHead = tempHead.left;

            } else {

                tempHead = tempHead.right;
            }

        }

        if(parent.data < data){
            parent.right = newNode;
        }
        else  parent.left = newNode;

        return head;
    }

    public  int height (Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;

    }


    public  int size (Node root){
        if(root == null){
            return 0;
        }

        int leftSize = height(root.left);
        int rightSize = height(root.right);
        return leftSize+rightSize+1;

    }




    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        Node head = null;
        head = bt.addNode(10, head);
        head = bt.addNode(15, head);
        head = bt.addNode(5, head);
        head = bt.addNode(7, head);
        head = bt.addNode(19, head);
        head = bt.addNode(20, head);
        head = bt.addNode(-1, head);
        head = bt.addNode(21, head);
       // System.out.println(bt.height(head));

    }

}


class Node {

    Node left;
    Node right;
    int data;
    int size;
    int height;
    public static Node newNode(int data){
        Node node = new Node();
        node.data= data;
        return node;
    }




}