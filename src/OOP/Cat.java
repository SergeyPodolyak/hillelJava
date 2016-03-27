package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Cat implements Comparable{
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
/**
    //Очень важно название метода если поменять работать не будет. Метод возвращеет описание параметров
    public String toString() {
        String ollInformation = "Cat name is " + name + " have colour" + color+"Cuanttyt legs = " + cuantityLegs;
        return ollInformation;
    }
*/
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
    @Override
    public int compareTo(Object o) {
        Cat other = (Cat) o;
        if (birthYear > other.birthYear) {
            return -5;
        } else if (birthYear < other.birthYear) {
            return 32;
        }
        return 0;

        //return other.birthYear - birthYear;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (birthYear != cat.birthYear) return false;
        if (!color.equals(cat.color)) return false;
        return name.equals(cat.name);

    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + birthYear;
        return result;
    }
}
