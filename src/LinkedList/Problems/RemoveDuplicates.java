package LinkedList.Problems;


import LinkedList.SingleLinkedList;

public class RemoveDuplicates {

    private Node head;
    private Node tail;

    int size;

//    public RemoveDuplicates(int size) {
//        this.size = size;
//    }

    public static void main(String[] args) {
            RemoveDuplicates list=new RemoveDuplicates();
            list.insertionAtLast(1);
        list.insertionAtLast(1);
        list.insertionAtLast(2);
        list.display();
        list.duplicates();
        list.display();

    }

    private void duplicates(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
            }
            node=node.next;
        }
        tail=node;
        tail.next=null;
    }
    public void insertionAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1; //We use Size For The Purpose Of The Using In Insertion At Particular Point..
        // And Also Of The Size Of The Linked List
    }
    public void insertionAtLast(int val){
        if(tail==null){
            insertionAtFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public class Node{ //A Template For The Node...Which Contains Value and next pointer;
        int value;
        Node next;
        //Constructors For The Usage Purpose...
        public Node(int value) {

            this.value = value;
        }
        public Node(int value,Node next) { //constructor for the insertion at particular point....
            this.value = value;
            this.next = next;
        }
    }

}
