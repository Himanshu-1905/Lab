package ThursdayLab;
/*
Problem Statement # 2:
Now we will see how multi threading can improve the performance by reducing the response time. Modify the application as a multi threaded program which can load the array list in X/2 seconds.
*/
class LoaderThread implements Runnable {
    int startNumber;
    int lastNumber;
    ListLoader listLoader;

    public LoaderThread(int startNumber, int lastNumber, ListLoader listLoader) {
        this.startNumber = startNumber;
        this.lastNumber = lastNumber;
        this.listLoader = listLoader;
    }

    @Override
    public void run() {
        listLoader.loadList(startNumber, lastNumber);
        System.out.println("Loaded numbers from " + startNumber + " to " + lastNumber);
    }
}

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        ListLoader listLoader = new ListLoader();
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new LoaderThread(0, 500000, listLoader));
        Thread t2 = new Thread(new LoaderThread(500000, 1000000, listLoader));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("Response Time: " + responseTime + " milliseconds");
    }
}
