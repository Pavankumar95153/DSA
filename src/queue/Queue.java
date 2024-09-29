package queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;
    class Node{
        int value;
        Node next;
         Node(int value){
            this.value = value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length =1;
    }

    public void printQueue(){
        Node temp= first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFrist(){
        System.out.println("first node value is --> "+ first.value);
    }

    public void getLast(){
        System.out.println("last node value is -->"+ last.value);
    }
    public void getLength(){
        System.out.println("length value is -->"+length);
    }

    public void enQueue(int value){

       Node newNode = new Node(value);
        if(length ==0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node deQueue(){
        if(first == null) return null;
        Node temp = first;
        if(length ==1){
            first = null;
            last = null;
        }
        else {
            first = first.next;
            temp.next = null;
        }
        length --;
     return  temp;
    }
}