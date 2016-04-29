package multithreading;

/**
 * Created by User on 29.04.2016.
 */
public class Bank {
    private long account1  = 10_000_000;
    private long account2 = 10_000_000;

    public void transfer (boolean direction, int amont){
        if (direction){
            account1-=amont;
            account2+=amont;
        }else {
            account2-=amont;
            account1+=amont;
        }
    }
    public void check(){
        if (account1+account2!=20_000_000){
            System.out.println("Somsing wrong happen");
        }
        System.out.println(account1);
        System.out.println(account2);
    }

}
