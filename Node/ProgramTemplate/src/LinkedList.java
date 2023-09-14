public class LinkedList {
    private Node first;
    private Node last;

    LinkedList() {
        first = last = null;
    }

    public void insertFirst(String item) {
        Node newFirst = new Node(item);
        //sending string value item and assignening it to the Node newFirst
        if(isEmpty()) {
            first = last = newFirst;
            return;
        }

        Node oldFirst = first;
        newFirst.next = oldFirst;
        first = newFirst;
    }

    public void insertLast(String item) {
        Node newLast = new Node(item);
        if(isEmpty()) {
            first = last = newLast;
            return;
        }
        Node oldLast = last;
        oldLast.next = newLast;
        last = newLast;
        
    }

    public boolean isEmpty() {
        return first==null;

    }

    public void displayList() {
        Node nav = first;
        while (nav != null) {
            System.out.print(nav.item + " ");
            nav = nav.next;
        }
    }

    public void removeFirst() {
        if(!isEmpty()) {
           first = first.next; 
        }
        else {
            System.out.print("List is empty - Nothing to Remove");
        }
    }

    public void removeLast() {
        if(!isEmpty()) {
            
        }

        /* while (nav.next != last) {
            nav = nav.next;
        }
        nav.next = null;
        last = nav;
        */
    }

    /* 
 * public int getSize() {
 *     Node n = first;
 *     int count = 0;
 *     while (n != null) {
 *         n = n.next;
 *         count++;
 *      }
 *      return count
 * }
 */

}
