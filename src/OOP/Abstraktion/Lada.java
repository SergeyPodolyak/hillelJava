package OOP.Abstraktion;

/**
 * Created by User on 11.03.2016.
 */
public class Lada extends Auto implements Repaireble{

    public Lada(int year){
        super(year);
    }



    public String getMark(){
      return "Lada";
    }
    public void repair(){
        System.out.println("repair");
    }
}
