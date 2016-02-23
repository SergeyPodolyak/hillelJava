package OOP;

/**
 * Created by User on 23.02.2016.
 */
public class OopMain {
    public static void main(String[] args) {
        //array();
       // equals();
        Human i= new Human();
        System.out.println(Human.handsAmount);
    Human.handsAmount=1;
        System.out.println(Human.handsAmount);
         i.handsAmount=2;
        System.out.println(Human.handsAmount);
        i.name="Serj";
        System.out.println("My name is "+i.name);
        Human yuo= new Human();
        yuo.name="Serj2";
        System.out.println("We broter"+(i.equals(yuo)));
        System.out.println("=="+(i==yuo));

       System.out.println( Human.sayHallo());
        System.out.println(i.introduse());
        System.out.println(yuo.introduse());

    }
















    private static void array() {
        int[] ints= new int[3];

        for (int i=0; i<ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
        System.out.println();
        modifiArray(ints);
        for (int i=0; i<ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
        Integer i = new Integer(10);
        modifiInteger(i);
    }

    private static void equals() {
        Integer a=333;
        Integer b=333;
        System.out.println("=="+(a==b));
        boolean aEqualsB = a.equals(b);
        System.out.println("equals"+aEqualsB);
    }

    public static void modifiArray (int[] array){
        array[0]=10;
        array[1]=20;

    }
    public static void modifiInteger (Integer i){
        i=12;
    }
}
