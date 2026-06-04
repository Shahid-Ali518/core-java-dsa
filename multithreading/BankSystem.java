package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount extends Thread{

    private int balance = 1000;

    private final Lock lock = new ReentrantLock();

    public BankAccount(String name){
        super(name);
    }

    public void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
            if(balance >= amount){
                try {
                    System.out.println(Thread.currentThread().getName() + " processing to withdraw " + amount);
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdraw " + amount);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                finally {
//                    if(lock.isHeldByCurrentThread()){
//                        lock.unlock();
//                    }
                    lock.unlock();
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + " insufficient balance");
            }

        }
        else {
            System.out.println(Thread.currentThread().getName() + " could not acquire lock, try again later ");

        }
    }

    @Override
    public void run() {
        try {
            this.withdraw(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("shared-account");

        Thread user1 = new Thread(() -> {
            try {
                account.withdraw(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "user1");

        Thread user2 = new Thread(() -> {
            try {
                account.withdraw(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "user2");

        user1.start();
        user2.start();

    }
}
