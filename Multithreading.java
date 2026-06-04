
class NewThread extends Thread{
//    Thread t;
    String name;
    public NewThread(String threadName){
        super(threadName);
        name = threadName;
//        t = new Thread(threadName);
        System.out.println("Child Thread: " + this);
        start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Interrupted" + e.getMessage() );
        }
        System.out.println(name + " exiting");
    }
}


public class Multithreading {

    public static void main(String[] args) {

//        Thread t = Thread.currentThread();
//        System.out.println("Current Thread: " + t);
//
//        t.setName("New Name");
//        System.out.println(t);

        new NewThread("one");
        new NewThread("two");
        new NewThread("three");

        try{
//            for(int i= 5; i > 0; i--){
//                System.out.println( "Main thread: " + i);
//            }
                Thread.sleep(10000);

        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Exiting main thread");
//        System.out.println("Name: " + t.getName() + " Priority: " + t.getPriority() +  " State: " + t.getState());
    }

}
