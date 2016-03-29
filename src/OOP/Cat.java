package OOP;

import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class Cat {
    static final int IESS_OF_CATS = 2;// статическая не изменяемая переменная колличество глаз

    private String color;
    private String name;
    private int birthYear;
    private int cuantityLegs;
    private String[] vaccine = new String[10];
    private int vaccinesCount;

    //Конструктор объекта
    public Cat(String name, String colour, int birthYear, int cuantityLegs) {
        this.name = name;
        this.color = colour;
        this.birthYear = birthYear;
        this.cuantityLegs = cuantityLegs;
    }

    public void meow() {
        System.out.println("Myu");
    }

    public void vaccination(String nameVaccine) {
        vaccine[vaccinesCount] = nameVaccine;
        vaccinesCount = vaccinesCount + 1;
        meow();
    }

    //Очень важно название метода если поменять работать не будет. Метод возвращеет описание параметров
    public String toString() {
        String ollInformation = "Cat name is " + name + " have colour" + color+"Cuanttyt legs = " + cuantityLegs;
        return ollInformation;
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

    //Метод смены значения параметра
    public void setName(String name) {
        this.name = name;
    }

    public void setCuantityLegs(int cuantityLegs) {
        this.cuantityLegs = cuantityLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (getBirthYear() != cat.getBirthYear()) return false;
        if (cuantityLegs != cat.cuantityLegs) return false;
        if (vaccinesCount != cat.vaccinesCount) return false;
        if (getColor() != null ? !getColor().equals(cat.getColor()) : cat.getColor() != null) return false;
        if (getName() != null ? !getName().equals(cat.getName()) : cat.getName() != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(vaccine, cat.vaccine);

    }

    @Override
    public int hashCode() {
        int result = getColor() != null ? getColor().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getBirthYear();
        result = 31 * result + cuantityLegs;
        result = 31 * result + Arrays.hashCode(vaccine);
        result = 31 * result + vaccinesCount;
        return result;
    }
}
