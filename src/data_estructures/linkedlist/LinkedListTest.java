package data_estructures.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("List size: " + linkedList.size());
        linkedList.addFirst("Element 1");
        linkedList.addLast("Element 2");
        linkedList.addLast("Element 3");
        linkedList.addFirst("Element 0");
        System.out.println("List size: " + linkedList.size());

        linkedList.printList();

        linkedList.delete(0);
        System.out.println("List size: " + linkedList.size());
        linkedList.delete(linkedList.size()-1);

        linkedList.printList();



    }
}
