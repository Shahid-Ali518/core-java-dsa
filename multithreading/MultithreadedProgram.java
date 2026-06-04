package multithreading;


class ChildThread implements Runnable{

    String name;
    Thread thread;

    // constructor
    public ChildThread(String name){
        this.name = name;
        thread = new Thread(this, "child thread"); // thread must be passed to runnable constructor
        System.out.println("New Thread: " + thread);
        thread.start(); // starts the thread when object is created
    }

    @Override
    public void run(){

        try{
            for (int i = 5; i > 0; i--) {
                System.out.println( name + ": " + i);
                Thread.sleep(500);

            }
        }
        catch (InterruptedException e){
            System.out.println("Interrupted Exception occurred"  + e);
        }
        System.out.println("Exiting Child Thread " + name);
    }

}

public class MultithreadedProgram {

    public static void main(String[] args) {

        ChildThread childThread1 = new ChildThread("One");
        ChildThread childThread2 = new ChildThread("Two");
        ChildThread childThread3 = new ChildThread("Three");

        // check whether thread is running or not
        System.out.println("Checking Thread's state: ");
        System.out.println("Thread One is : " + childThread1.thread.isAlive());
        System.out.println("Thread Two is : " + childThread2.thread.isAlive());
        System.out.println("Thread Three is : " + childThread3.thread.isAlive());

        // waiting for threads are finishing
        try{
            System.out.println(Thread.currentThread().getName());

            childThread1.thread.join();
            childThread2.thread.join();
          childThread3.thread.join();

        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread One is : " + childThread1.thread.isAlive());
        System.out.println("Thread Two is : " + childThread2.thread.isAlive());
        System.out.println("Thread Three is : " + childThread3.thread.isAlive());

        System.out.println("Exiting Main Thread");
    }


}
