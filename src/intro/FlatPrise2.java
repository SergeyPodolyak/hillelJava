package intro;

/**
 * Created by User on 12.02.2016.
 */
public class FlatPrise2 {
    public static void main(String[] args) {
        int days= 50;
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
