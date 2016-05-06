package multithreading;

/**
 * Created by User on 06.05.2016.
 */
public class Bucket {
    private int counter;
    public synchronized void get() {
        while (counter <= 0) {
            try {
                wait();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        counter--;
        notifyAll();
        chek();
    }




    public synchronized void put(){

        while (counter >=1000) {
            try {
                wait();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        counter++;
        notifyAll();
        chek();
        }


    private void chek(){
        if (counter<0 || counter>1000){
            System.out.println("error: counter = "+counter);
        }
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "counter=" + counter +
                '}';
    }
}

