
//Written by Dr. Suberi and finished by Noah Barrall

public class LinkedList {
    private Node first;
    private Node last;

    LinkedList(){
        first = last = null;
    }

    public void insertFirst(String item){
        Node newFirst = new Node(item);
        if(isEmpty()){
            first = last = newFirst;
            return;
        }

        Node oldFirst = first;
        newFirst.next = oldFirst;
        first = newFirst;
    }

    public void insertLast(String item){
        Node newLast = new Node(item);
        if(isEmpty()){
            first = last = newLast;
            return;
        }
        Node oldLast = last;
        oldLast.next = newLast;
        last = newLast;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void displayList(){
        Node nav = first;
        if(isEmpty()){
            System.out.println("\nList is Empty!");
            return;
        }
        System.out.println("\nThis List Contains");
        while(nav != null){
            System.out.print(nav.item + "->");
            nav = nav.next;
        }
        System.out.print("NULL\n");
    }

    public void removeFirst(){
        if(!isEmpty()){
            first = first.next;
        }
        else{
            System.out.println("\nList is Empty - Nothing to Remove");
        }
    }

    public void removeLast(){
        //if the list is empty it will move on
        if(isEmpty()) {
            return;
        }
        //only for when there is one node in the list and allows
        //you to use the removeLast function
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        Node nav = first;
    
        while (nav.next != last) {
            nav = nav.next;
        }
        nav.next = null;
        last = nav;
    }

}