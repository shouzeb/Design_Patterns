

import java.util.concurrent.LinkedBlockingQueue;
 
public class ThreadPool {
	
    private final int numberOfThreads;
    private final PoolWorker[] threadsWorkers;
    private final LinkedBlockingQueue linkedBlockingQueue;
 
    public ThreadPool(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
        linkedBlockingQueue = new LinkedBlockingQueue();
        threadsWorkers = new PoolWorker[numberOfThreads];
 
        for (int i = 0; i < numberOfThreads; i++) {
            threadsWorkers[i] = new PoolWorker();
            threadsWorkers[i].start();
        }
    }
 
    public void execute(Runnable task) {
        synchronized (linkedBlockingQueue) {
            linkedBlockingQueue.add(task);
            linkedBlockingQueue.notify();
        }
    }
 
    private class PoolWorker extends Thread {
        public void run() {
            Runnable task;
 
            while (true) {
                synchronized (linkedBlockingQueue) {
                    while (linkedBlockingQueue.isEmpty()) {
                        try {
                            linkedBlockingQueue.wait();
                        } catch (InterruptedException e) {
                            System.out.println("An error encountered while queue is waiting: " + e.getMessage());
                        }
                    }
                    task = (Runnable) linkedBlockingQueue.poll();
                }
 
                try {
                    task.run();
                } catch (RuntimeException e) {
                    System.out.println("Thread pool is interrupted due to an action: " + e.getMessage());
                }
            }
        }
    }
}