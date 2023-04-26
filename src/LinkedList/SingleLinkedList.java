package LinkedList;

import java.util.Arrays;

public class SingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.insertionAtFirst(2);
        list.insertionAtFirst(3);
        list.insertionAtFirst(4);
        list.insertionAtFirst(5);
        list.insertionAtFirst(6);
        list.insertionAtFirst(7);
        list.insertionAtLast(8);
        list.insertionAtSpecificPosition(100,3);
        list.display();
        System.out.println("element at first "+ list.deletionAtFirst());
        list.display();
        System.out.println("element at last"+list.deletionAtLast());
        list.display();
        System.out.println("element at specific pos"+list.deletionAtSpecificPosition(2));
        list.display();
      //  System.out.println(list.find(Arrays.toString(2));
    }

    private Node head;
    private Node tail; //If We Take Tail,We can Do in constant Time Complexity.
    int size;

    public SingleLinkedList() {
        this.size=0;
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
        public void insertionAtSpecificPosition(int val,int index){
        if(index==1){
            insertionAtFirst(val);
        }
        if(index==size){
            insertionAtLast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next); //temp.next is a constructor call of node.next=temp.next
        temp.next=node;
        //node.next=temp;
            size++;
        }

        public int deletionAtFirst(){
            int val= head.value;
            head=head.next;

            if(head==tail){
                tail=null;
            }
            size--;
            return val;
        }

        public int deletionAtLast(){
            if(size<=1){
                deletionAtFirst();
            }
            Node secondlast=get(size-2); // It is (size-2) , If For Loop Starts With First Index..
            int val= tail.value;
            tail=secondlast;
            tail.next=null;
            return val;
        }

        public int deletionAtSpecificPosition(int index){
            if(index==0){
                deletionAtFirst();
            }
            if(index==size){
                deletionAtLast();
            }
            Node prev=get(index-1);
            int val=prev.next.value;
            prev.next=prev.next.next;
            size=-1;
             return val;
        }

        public Node get(int index){ //A Function Which We Get The Second Last Element point;
            Node node=head;
            for (int i = 0; i < index; i++) {
                node=node.next;
            }
            return node;
        }

    public Node find(int value){ //A Function Which We Get The Second Last Element point;
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.print("END");
        }

        //Class is our Data Type.So
    public class Node{ //A Template For The Node...Which Contains Value and next pointer;
        int value;
        Node next;
        //Constructors For The Usage Purpose...
        public Node(int value) {

            this.value = value;
        }
        public Node(int value, Node next) { //constructor for the insertion at particular point....
            this.value = value;
            this.next = next;
        }
    }

}
