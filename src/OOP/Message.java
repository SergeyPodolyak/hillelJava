package OOP;

/**
 * Created by ADMIN on 29.02.16.
 */
public class Message {
    private String message;
    private char codeCharacter;


    public Message(String message, char codeCharacter){
        this.message=message;
        this.codeCharacter=codeCharacter;

    }

    public void codUncodMessage(){
      char[] messageToArrey = new char[message.length()];
        messageToArrey=message.toCharArray();
        for (int i=0; i<messageToArrey.length;i++ ){
            messageToArrey[i]^=codeCharacter;
        }
        message=String.copyValueOf(messageToArrey);
    }
    public String getMessage(){return message;}
}
