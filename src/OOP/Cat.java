package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Cat {
    private String color;
    private String name;
    private int birthYear;
    private String[] vaccine = new String[10];
    private int vaccinesCount;

    public Cat(String name, String colour, int birthYear) {
        this.name = name;
        this.color = colour;
        this.birthYear = birthYear;
    }

    public void meow() {
        System.out.println("Myu");
    }

    public void vaccination(String nameVaccine) {
        vaccine[vaccinesCount] = nameVaccine;
        vaccinesCount = vaccinesCount + 1;
        meow();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}
