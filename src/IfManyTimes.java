/**
 * Created by ADMIN on 01.01.02.
 */
public class IfManyTimes {
    public static void main(String[] args) {
        int a = 30;
        int b = 25;
        int c = 15;
        if (a != b && a != c && c != b) {
            if (a > b && a > c) {
                System.out.println("Max number is " + a);
            } else {
                if (b > c && b > a) {
                    System.out.println("Max number is " + b);
                } else {
                    System.out.println("Max number is " + c);
                }
            }
        } else {
            if (a == b && a == c && c == b) {
                System.out.println("Oll number quel ich other ");
            }else {
                if (a >= b && a >= c) {
                    System.out.println("Max number is " + a);
                }else {if (b >= a && b >= c) {
                    System.out.println("Max number is " + b);
                }else{System.out.println("Max number is " + c);}
                }
            }
        }

    }
}
