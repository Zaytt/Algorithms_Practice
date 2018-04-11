package data_estructures.linkedlist;

public class LinkedList<T> {
    private Node first;
    private Node last;
    private int listCount;

    //Creates an empty list
    public LinkedList() {
        this.first = null;
        this.last = null;
        this.listCount = 0;
    }

    //Adds an element at the beginning of the list
    public void addFirst(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        listCount++;
    }

    //Adds an element at the end of the list
    public void addLast(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        listCount++;
    }

    public boolean delete(int index){
        if(isEmpty()){
            System.out.println("Nothing to delete. List is empty");
            return false;
        } else {
            //If the deleted index is the first one
            if(index == 0){
                first = first.next;
                listCount--;
                return true;
            }

            int counter = 0;
            Node currentNode = first;

            //Get to the previous Node before the index
            while(counter < index-1){
                currentNode = currentNode.next;
                counter++;
            }

            //If the deleted node is the last one
            if(currentNode.next.next == null){
                currentNode.next = null;
                last = currentNode;
                listCount--;
                return true;
            } else { //If the deleted node has a link to another node
                currentNode.next = currentNode.next.next;
                listCount--;
                return true;
            }
        }
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("Nothing to print. List is empty");
            return;
        }
        Node currentNode = first;
        do{
            System.out.println(currentNode.toString());
            currentNode = currentNode.next;
        }while(currentNode != null);

    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    public int size(){
        return listCount;
    }


}
