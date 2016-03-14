package OOP.Abstraktion.HomeWork6;

/**
 * Created by ADMIN on 12.03.16.
 */
public class GuideDog extends Dog {
    private boolean trained;

    /**
     *
     * @param id
     * @param age
     * @param weight
     * @param colour
     * @param name
     * @param isVactinated
     * @param trained
     */
    public GuideDog(int id, int age, int weight, String colour, String name, boolean isVactinated, boolean trained) {
        super(id, age, weight, colour, name, isVactinated);
        this.trained = trained;
    }

    /**
     *
     * @return
     */
    public String voice() {
        if (trained == true) {
            return super.voice() + "I can take you home";
        }
        return super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + ", Trained " + trained;
    }
}
