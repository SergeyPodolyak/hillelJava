package multithreading.bank;

/**
 * Created by User on 29.04.2016.
 */
public class Multithraiding {
    public static void main(String[] args) {
        Thread anotherThread = new Thread(new NumberPrint());
        anotherThread.start();

      new NumberPrint().run();



        }

    }

