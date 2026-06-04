package multithreading;

class Q {
    int n;
    boolean setValue = false;

    public synchronized int get(){
        while (!setValue){
            try{
                wait();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Got: " + n);
        setValue = false;
        notify();
        return n;
    }

    public synchronized void put(int n){
        while (setValue){
            try{
                wait();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.n = n;
        System.out.println("Put: " + n);
        setValue = true;
        notify();

    }
}
// producer class
class Producer extends Thread{

    Q q;

    public Producer(Q q){
        this.q = q;
        this.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}
// Consumer class
class Consumer extends Thread{

    Q q;

    public Consumer(Q q){
        this.q = q;
        this.start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}

public class WaitAndNotify {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press Control-C to stop.");
    }
}
