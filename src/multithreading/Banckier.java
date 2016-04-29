package multithreading;

import java.util.Random;

/**
 * Created by User on 29.04.2016.
 */
public class Banckier implements Runnable{
    private Bank bank;
    private Random random = new Random();

    public Banckier(Bank bank){
        this.bank = bank;
    }
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            int amont=random.nextInt(1000)+1;
            boolean direction = random.nextBoolean();
            bank.transfer(direction,amont);
        }
    }
}
