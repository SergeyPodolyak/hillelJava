package OOP;

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

    // Очень важный метод сравнения двух объектов класса
    public boolean equals(Cat other) {
        return this.birthYear == other.birthYear;
    }
}
