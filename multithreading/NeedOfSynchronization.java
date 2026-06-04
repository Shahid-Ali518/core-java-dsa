package multithreading;

class CallMe {

    // this method is mixed up with coming threads, not worked for a thread
    // fixed with synchronized, now it becomes monitor, one thread treated at a time

    // public synchronized void call() ...
    public void call(String message){
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }
}

class Caller extends Thread{
    String msg;
    CallMe target;

    public Caller(CallMe target, String msg){
        this.msg = msg;
        this.target = target;
        this.start();
    }

    @Override
    public void run(){
        // synchronized block, just block not method
        synchronized (target){
            this.target.call(msg);

        }
    }
}

public class NeedOfSynchronization {

    public static void main(String[] args) {

        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        // wait for threads to end
        try {
            ob1.join();
            ob2.join();
            ob3.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}



