import edu.princeton.cs.algs4.*;

/*
 * File Name: App.java
 * Dependent Files:
 * Assignment Description:
 * Author:
 * Date:
 */

public class App {
    public static void main(String[] args) throws Exception {
        StdOut.println("CIS 385 - Data Structures and Algorithms");
        RQueue RQ = new RQueue();
        RQ.enqueue("1");
        RQ.enqueue("2");
        RQ.enqueue("3");
        RQ.enqueue("4");
        RQ.enqueue("5");
        RQ.enqueue("6");
        RQ.display();
        RQ.dequeue();
        RQ.display();
        RQ.enqueue("7");
        RQ.dequeue();
        RQ.dequeue();
        RQ.dequeue();
        RQ.dequeue();
        RQ.display();
        RQ.enqueue("8");
        RQ.enqueue("9");
        RQ.enqueue("10");
        RQ.dequeue();
        RQ.dequeue();
        RQ.dequeue();
        RQ.display();

    }
}
