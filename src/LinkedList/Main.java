package LinkedList;

public class Main {
  public static void main(String[] args) {
    SingleLinkedList sll = new SingleLinkedList();
    sll.createSingleLinkedList(6);
    System.out.println(sll.head.value);
  }
}