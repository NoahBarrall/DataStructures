public class testLinkedList {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.insertFirst("hello");
        LL.insertFirst("world");

        LL.insertLast("ur mom");

        LL.displayList();

        LL.removeLast();
        System.out.println();
        LL.displayList();


    }
}
