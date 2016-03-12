package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public abstract class WildAnimal extends Animal {
    private boolean isPredator;

    /**
     * @param id
     * @param age
     * @param weight
     * @param colour
     * @param isPredator
     */
    public WildAnimal(int id, int age, int weight, String colour, boolean isPredator) {
        super(id, age, weight, colour);
        this.isPredator = isPredator;
    }

    /**
     * @return
     */
    public String voice() {
        if (isPredator = true) {
            return super.voice() + " I am a wild animal " + "and I am angry ";
        }
        return super.voice() + " I am a wild animal";
    }

    @Override
    public String toString() {
        return super.toString() + ", Is predator " + isPredator;
    }
}


