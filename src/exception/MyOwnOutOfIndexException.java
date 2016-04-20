package exception;

/**
 * Created by ADMIN on 20.04.16.
 */
public class MyOwnOutOfIndexException extends RuntimeException{
    public MyOwnOutOfIndexException(String message){
        super(message);
    }
}
