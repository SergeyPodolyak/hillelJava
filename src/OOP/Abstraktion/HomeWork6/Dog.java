package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public class Dog extends HomeAnimal {
    /**
     *
     * @param id
     * @param age
     * @param weight
     * @param colour
     * @param name
     * @param isVactinated
     */
    public Dog(int id, int age, int weight, String colour, String name, boolean isVactinated){
        super(id,age,weight,colour,name,isVactinated);
    }

    /**
     *
     * @return
     */
    public String voice(){
        return super.voice()+" Woof";
    }

   @Override
    public String toString(){
        return super.toString();
    }
}
