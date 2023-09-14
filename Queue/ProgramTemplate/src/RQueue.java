public class RQueue {

    int SIZE = 5;
    String QArray[] = new String[SIZE];
    int front, rear;

    RQueue(){
        front = rear = -1;
    }

    public void enqueue(String item){
        if(isFull()){
            System.out.println("Queue is Full - Cannot Add Item!");
            return;
        }
        if(front == -1){
            front = rear = 0;
        } else {
            rear++;
        }
        QArray[rear] = item;
    }

    //not passing parameter because we are removing item not adding a string/int
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty - Nothing to Remove");
            return;
        }
        if(front == rear){
            front = rear = -1;
            return;
        }
        front++;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        } 
        for(int i = front; i <= rear; i++){
            System.out.print(QArray[i] +"  ");
        }
        System.out.println();
    }

    boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return rear == SIZE - 1;
    }
}