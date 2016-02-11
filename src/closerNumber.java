/**
 * Created by ADMIN on 12.02.16.
 */
public class closerNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 30;
        int c = 10;
        if ((Math.abs(c-b)>(Math.abs(c-a)))){
            System.out.println("Number " +a+" is close to "+c+" then "+b);
        }else{
            System.out.println("Number " +b+" is close to "+c+ "then "+b);
        }
    }
}
