/**
 * Created by User on 19.02.2016.
 */
public class FromBinaryToNormal {
    public static void main(String[] args) {
        int[] binaryNumber={0,0,0,1,1,0,0,0,1};
        double decemalNumber=0;

        for (int i=0; i<binaryNumber.length;i++){

                decemalNumber=decemalNumber+(binaryNumber[i]*(Math.pow(2,(8-i))));
        }
        System.out.println(decemalNumber);
    }
}
