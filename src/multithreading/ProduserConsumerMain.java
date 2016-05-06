package multithreading;

/**
 * Created by User on 06.05.2016.
 */
public class ProduserConsumerMain {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Thread consumerThred = new Thread(new Consumer(bucket));
        Thread produtherThred = new Thread(new Producer(bucket));

        consumerThred.start();
        produtherThred.start();

        consumerThred.interrupt();
        produtherThred.interrupt();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            produtherThred.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            consumerThred.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all therds are stoped");
        System.out.println(bucket);
    }
}
