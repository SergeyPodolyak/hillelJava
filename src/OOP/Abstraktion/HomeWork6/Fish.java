package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public class Fish extends WildAnimal {
    private String name;

    /**
     *
     * @param id
     * @param age
     * @param weight
     * @param colour
     */
    public Fish(int id, int age, int weight, String colour) {
        super(id, age, weight, colour, false);

    }

    /**
     *
     * @return
     */
    public String toString() {

        if (this.name != null) {
            return super.toString() + ", Name " + this.name;
        }
        return super.toString();
    }

    /**
     *
     * @return
     */
    public String voice() {
        return "Bul Bul";
    }

    /**
     *
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

}
