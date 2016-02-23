package intro;

/**
 * Created by ADMIN on 12.02.16.
 */
public class FlatPay {
    public static void main(String[] args) {
        int days= 4;
        int prise=40;
        int totalPris;
        if (days<7&&days>3){
            totalPris=days*prise-40;
            System.out.println("Total prise = " + totalPris+"$");
        }else {
            if(days>=7){
                totalPris=days*prise-50;
                System.out.println("Total prise = " + totalPris+"$");
            }else{
                totalPris=days*prise;
                System.out.println("Total prise = " + totalPris+"$");
            }
        }
    }
}
