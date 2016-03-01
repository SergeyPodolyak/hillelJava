package OOP;

/**
 * Created by ADMIN on 02.03.16.
 */
public class HomeWork5 {
    public static void main(String[] args) {
        ImprovedArray veryUsfulArray = new ImprovedArray();
        veryUsfulArray.add("a");
        veryUsfulArray.add(",");
        veryUsfulArray.add("cb");
        veryUsfulArray.add("acvb");
        veryUsfulArray.add("aas");
        veryUsfulArray.add("ad");
        veryUsfulArray.add("awdf");
        veryUsfulArray.add("asdf");
        veryUsfulArray.add("afb");
        String shoeElement = veryUsfulArray.get(15);
        System.out.println(shoeElement);
        System.out.println(veryUsfulArray);
    }
}
