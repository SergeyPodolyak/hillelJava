package multithreading;

/**
 * Created by User on 29.04.2016.
 */
public class NumberPrint implements Runnable{
    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = currentThread.getName();
            System.out.println(i + name);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
