package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public class Wolf extends WildAnimal {
    private String name;

    /**
     * @param id
     * @param age
     * @param weight
     * @param colour
     */
    public Wolf(int id, int age, int weight, String colour) {

        super(id, age, weight, colour, true);
    }

    /**
     * @return
     */
    public String voice() {
        return super.voice();
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (name != null) {
            return super.toString() + ", Name " + name;
        }
        return super.toString();
    }
}
