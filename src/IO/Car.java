package IO;

/**
 * Created by User on 19.04.2016.
 */
public class Car {
    private final String brand;
    private final int year;
    private final Person owner;
    private transient Rentor rentor;

    public Car(String brand, int year, Person owner) {
       System.out.println("in car konstruktor vith three parametrs");
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    public void setRentor(Rentor rentor) {
        this.rentor = rentor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                ", rentor=" + rentor +
                '}';
    }
}