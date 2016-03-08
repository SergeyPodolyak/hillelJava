package OOP;

/**
 * Created by ADMIN on 08.03.16.
 */
public class Crypt {
    private char[] key;

    //Constructor encoder
    public Crypt(String cayString) {
        key = new char[cayString.length()];
        key = cayString.toCharArray();
    }

    //A method of encrypting a message
    public String crypt(String message) {
        String cryptMessage;
        char[] messageArey = new char[message.length()];
        messageArey = message.toCharArray();
        int keyIndex = 0;
        for (int i = 0; i < messageArey.length; i++) {

            if (keyIndex >= this.key.length - 1) {
                keyIndex = 0;
            }
            messageArey[i] ^= this.key[keyIndex];
            keyIndex = keyIndex + 1;
        }
        return cryptMessage = String.copyValueOf(messageArey);
    }
}
