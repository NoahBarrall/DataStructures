public class CQueue {

        int SIZE = 5;
        String QArray[] = new String[SIZE];
        int front, rear;
    
        CQueue(){
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
                rear = (rear+1) % SIZE;
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
            front = (front + 1) & SIZE;
        }
    
        void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            } 
            int i;
            for(i = front; i != rear; i=(i+1)%SIZE)
                System.out.print(QArray[i] + "  ");
            System.out.print(QArray[i] + " ");
            System.out.println();
        }
    
        boolean isEmpty(){
            return front == -1;
        }
    
        public boolean isFull(){
            //checking if rear+1 % SIZE is equal to front, if it is true, then it is full
            return (rear+1) % SIZE == front ;
        }
    
}
