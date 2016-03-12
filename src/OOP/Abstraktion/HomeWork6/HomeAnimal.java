package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public abstract class HomeAnimal extends Animal {
    private String name;
    private boolean isVactinated;


    /**
     * @param id
     * @param age
     * @param weight
     * @param colour
     * @param name
     * @param isVactinated
     */
    public HomeAnimal(int id, int age, int weight, String colour, String name, boolean isVactinated) {
        super(id, age, weight, colour);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    /**
     *
     * @return
     */
    public String voice() {
        return super.voice() + ", My name is " + name;
    }

    /**
     *
     * @return
     */
    public String toString() {
        return super.toString() + ", Name " + name + ", Vactinated " + isVactinated;
    }
}
