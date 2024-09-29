package queue;

public class Main {
    public static void main(String[] args){
      Queue ts = new Queue(7);
      ts.enQueue(8);
      ts.printQueue();
      ts.getFrist();
      ts.getLast();
      ts.getLength();
      ts.deQueue();
      ts.printQueue();
    }
}