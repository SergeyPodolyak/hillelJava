package OOP;

/**
 * Created by ADMIN on 02.03.16.
 * The class created for the test classes Crypt and ImprovedArray
 */
public class HomeWork5 {
    public static void main(String[] args) {
        ImprovedArray veryUsfulArray = new ImprovedArray(1);
        veryUsfulArray.add("a");
        veryUsfulArray.add(",");
        veryUsfulArray.add("cb");
        ImprovedArray newVeryUsfulArray = new ImprovedArray(1);
        newVeryUsfulArray.add("a");
        newVeryUsfulArray.add(",");
        newVeryUsfulArray.add("cb");

        String shoeElement = veryUsfulArray.get(3);
        System.out.println(shoeElement);
        System.out.println("");
        System.out.println("Array 1 " + veryUsfulArray);
        System.out.println("Array 2 " + newVeryUsfulArray);
        boolean equalsOfTwoArray = veryUsfulArray.equals(newVeryUsfulArray);
        System.out.println(equalsOfTwoArray);


Crypt newCrypt=new Crypt("abc");
        String cryptMessage =newCrypt.crypt("Conducted courses on terrorists, and subsequent employment.");
        System.out.println(cryptMessage);
        String unCript = newCrypt.crypt(cryptMessage);
        System.out.println(unCript);


    }

}
