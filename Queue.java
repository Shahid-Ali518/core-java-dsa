import java.util.*;

class QueueImpl<T>{
    private T[] data;
    private int front;
    private int rear;
    private final int maxSize = 5;

    public QueueImpl(){
        this.data = (T[]) new Object[maxSize];
        this.front = -1;
        this.rear = -1;

    }

    boolean isEmpty(){
        return front < 0;
    }

    boolean isFull(){

        if(rear + 1 == maxSize && front == 0) {
            return true;
        }

        else return(rear + 1 == front) ;


    }

    public void clear(){
        front = -1;
        rear = -1;
    }

    public void enQueue(T newItem){
        if(!isFull()){
            if(rear + 1 == maxSize){
                rear = 0;
                data[rear] = newItem;
            }
            else if(rear == -1 && front == -1){
                front++;
                data[++rear] = newItem;
            }
            else
                this.data[++rear] = newItem;
        }
        else
            System.out.println("Queue is full");
    }

    public void deQueue(){

        if(rear == front){
           clear();
        }

        else
            this.front++;

    }

    public final T getFront(){
        return data[front];
    }

    public final T getRear(){
        return data[rear];
    }

    public final void showStructure(){
        if(!isEmpty()){
            // when all data is in sequence
          if(front <= rear){
              System.out.print("front-> ");
              for(int i = front; i <= rear; i++){
                  System.out.print(data[i] + ", ");
              }
              System.out.println("<-rear");
          }
          else {
              System.out.print("[");
              // print data from start to rear
              for(int j = 0; j <= rear; j++)
                  System.out.print(data[j] + ", ");
              // print data from front to maxsize
              for(int i = front; i < maxSize; i++){
                  System.out.print(data[i] + ", ");
              }
              System.out.println("]");
          }
        }
        else
            System.out.println("Queue is empty");
    }

}


public class Queue {

    public static void main(String[] args) {
        QueueImpl<Integer> queue = new QueueImpl<>();
        queue.showStructure();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.showStructure();

        queue.deQueue();
        queue.deQueue();
        queue.showStructure();

        queue.enQueue(9);
        queue.showStructure();

        queue.enQueue(10);
        queue.showStructure();

        queue.enQueue(11);
        queue.showStructure();

        System.out.println(queue.getFront());
        System.out.println(queue.getRear());


        // built in queue in java     
        java.util.Queue<String> q = new LinkedList<>();

        q.add("DSA");
        q.add("OOP");
        q.add("AOA");
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.add("SNA");
        System.out.println(q);
        System.out.println(q.size());

    }
}
