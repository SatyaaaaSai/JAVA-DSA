package LinkedList;

public class DoubleLinkedList {

    public static void main(String[] args) {
            DoubleLinkedList list=new DoubleLinkedList();
            list.insertionAtFirst(12);
            list.insertionAtFirst(13);
            list.insertionAtFirst(14);
            list.insertionAtFirst(15);
            list.insertionAtLast(100);
            list.display();
            list.insertionAtSpecificPos(100,123);
            list.display();

    }

    private Node head;
    private void insertionAtFirst(int val){
        Node node=new Node(val); //creating a  New Node..
        node.next=head;
        node.prev=null;
        if(head!=null){ //if you don't check this,it gives a error coz,in first insertion it is a null.so null.prev throws an error.
            head.prev=node;        }
        head=node;
    }

    private void insertionAtLast(int val){
        Node node=new Node(val);
        Node last=head;

        node.next=null; // irrespective that , it should be null.

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;

    }

    private void insertionAtSpecificPos(int afterNode,int value){ //Works on the basis of the after value,not the Index..
        Node p=find(afterNode);

        if(p==null){
            System.out.println("Element Does Not Exist!");
        }

        Node node=new Node(value);
        node.next=p.next;
        node.prev=p;
        p.next=node;
        if(node.next!=null) { // May be it gives a null pointer Exception. So Check Before to do below operation!
            node.next.prev = node;
        }
    }


    void display(){
        Node temp=head;
        Node tail=null; //For the purpose of maintain the last element and printing in Reverse Order
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            tail=temp;
            temp=temp.next;
        }
        System.out.println("END");

        System.out.println("In Reverse Order!!");
        Node temp2=tail;
        while(temp2!=null){
            System.out.print(temp2.val+"-> ");
            temp2=temp2.prev;
        }
        System.out.println("START");
    }



    public Node find(int value){  //For finding value.
        Node node=head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev) {
            this.next = next;
            this.prev = prev;
        }
    }
}
