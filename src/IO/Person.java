package IO;

import java.io.Serializable;

import java.io.Serializable;

/**
 * Created by MBCNEWMAIN on 04.03.2016.
 */
public class Person extends Object implements Serializable {
    private String name;
    private Car car;


    @Deprecated
    public Person() {
System.out.println("in default person construktor");
            }

    /**
     * this constructor creates person with name
     *
     * @param name person's name
     */
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void greeting() {
        System.out.println("Hello, I'm a person. My name is " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        Person other = (Person) o;
        return this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "I'm person, my name is " + getName();
    }
}