package OOP.Abstraktion;

/**
 * Created by User on 11.03.2016.
 */
public class AbstractionMain {
    public static void main(String[] args) {
        Auto auto = new Lada(1985);
        System.out.println(auto);
        repair((Repaireble) auto);

    }
    public static void repair(Repaireble toRepair){
        toRepair.repair();
    }



}
