package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public abstract class Animal {
    private int id;
    private int age;
    private int weight;
    private String colour;

    /**
     * @param id
     * @param age
     * @param weight
     * @param colour
     */
    public Animal(int id, int age, int weight, String colour) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
    }

    /**
     * @return
     */
     public String voice() {
        return "Hello";
    }

    @Override
    public String toString() {
        return "id " + id + ", Age " + age + ", Weight " + weight + ", Colour " + colour;
    }


}
