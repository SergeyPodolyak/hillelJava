import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class SwitchReyting {
    public static void main(String[] args) {
        int amount = 100;
        Scanner scanner=new Scanner (System. in);
        System.out.println("Inpuy reyting");


        String reyting = scanner.next();;
        int result=0;
        switch (reyting){
            case "terrible":
                result = amount+amount*0;
                break;
            case "good":
                result = amount+amount/20;
                break;
            case "nise":
                result =amount+amount/10;
                break;
            case "great":
                result =amount+amount/5;
                break;
            default:
                System.out.println("Unknown operation");

        }
        System.out.println("amount= " + result);
    }
}
