/**
 * Created by ADMIN on 21.02.16.
 */
public class Exampl5 {
    public static void main(String[] args) {
        int[] arrayA = {1,3,5,7,11,12,13,15};
        int[] arrayB = {2,4,6,8,9,10,};
        int lengthA = arrayA.length;
        int lengthB = arrayB.length;
        int[] arrayC=new int[lengthA+lengthB];
        int indexA=0;
        int indexB = 0;
        int indexC =0;
        while (indexA<lengthA||indexB<lengthB){
            if (indexA==lengthA){
                arrayC[indexC]=arrayB[indexB];
                indexC=indexC+1;
                indexB=indexB+1;
            }else{if (indexB==lengthB){
                arrayC[indexC]=arrayA[indexA];
                indexC=indexC+1;
                indexA=indexA+1;
            }else {if (arrayA[indexA]<arrayB[indexB]){
                arrayC[indexC]=arrayA[indexA];
                indexC=indexC+1;
                indexA=indexA+1;
            }else{
                arrayC[indexC]=arrayB[indexB];
                indexC=indexC+1;
                indexB=indexB+1;
            }
            }

            }
        }
        for (int i=0;i<arrayC.length; i++){
            System.out.print(arrayC[i]+", ");
        }

    }
}
