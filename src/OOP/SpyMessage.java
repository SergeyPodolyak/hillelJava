package OOP;

/**
 * Created by ADMIN on 29.02.16.
 */
public class SpyMessage {
    public static void main(String[] args) {
        Message someMessage = new Message("Hi where can I buy a gun and passport",'j');
        System.out.println(someMessage.getMessage());
        someMessage.codUncodMessage();
        System.out.println(someMessage.getMessage());
        someMessage.codUncodMessage();
        System.out.println(someMessage.getMessage());

    }
}
