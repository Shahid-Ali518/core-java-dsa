package corejava.collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapPractice {

    private static final ConcurrentHashMap<Integer, Integer> requestCounterMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        // We simulate a pool of 10 concurrent threads handling incoming API traffic
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        // Thread 1: Simulates users logging hits for User IDs 0 to 999
        Runnable trafficBatch1 = () -> {
            for (int i = 0; i < 1000; i++) {
                simulateApiHit(i);
            }
        };

        // Thread 2: Simulates the exact same users hitting the API again simultaneously
        Runnable trafficBatch2 = () -> {
            for (int i = 0; i < 1000; i++) {
                simulateApiHit(i);
            }
        };

        // Submit both tasks to run concurrently
        threadPool.submit(trafficBatch1);
        threadPool.submit(trafficBatch2);

        // Shut down the pool and wait for threads to finish
        threadPool.shutdown();
        threadPool.awaitTermination(5,  TimeUnit.SECONDS);

        // Verify the results
        System.out.println("Total unique users tracked: " + requestCounterMap.size());
        System.out.println("Requests recorded for User #5: " + requestCounterMap.get(5));
        System.out.println("Requests recorded for User #999: " + requestCounterMap.get(999));
    }

    /**
     * Increments the request count for a specific user safely across threads.
     */
    private static void simulateApiHit(int userId) {
        // ATOMIC OPERATION: compute takes a functional interface to update the value safely.
        // If the user doesn't exist, it initializes to 1. If they do, it increments by 1.
        requestCounterMap.compute(userId, (key, currentCount) ->
                (currentCount == null) ? 1 : currentCount + 1
        );
    }

}
