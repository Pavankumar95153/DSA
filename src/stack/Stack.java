package stack;

public class Stack {
    private Node top;
    private int height;
    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
}

public void printStack(){
        Node temp= top;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
public void printTop(){
        Node temp = top;
        System.out.println("top value is -->"+temp.value);
}
public void printNext(){
        Node temp = top;
        System.out.println("Next node value is-->"+temp.next);
}
public void printHeight(){
        System.out.println("height of the node-->"+ height);
}

public void pushNode(int value){
        Node newNode = new Node(value);
        if(height == 0){
            newNode = top;
        }else{
            newNode.next = top;
            top= newNode;
        }
        height++;
}




public Node popNode(){
        if (height ==0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
}

}