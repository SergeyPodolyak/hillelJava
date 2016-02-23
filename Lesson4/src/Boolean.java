/**
 * Created by User on 23.02.2016.
 */
public class Boolean {
    public static void main(String[] args) {
        boolean result = a()& b();
        System.out.println( result);
    }
    public static boolean a(){
        System.out.println("Metod a is called");
        return true;
    }
    public static boolean b(){
        System.out.println("Metod b is called");
        return true;
    }
}
