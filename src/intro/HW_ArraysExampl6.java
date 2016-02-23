package intro;

/**
 * Created by ADMIN on 17.02.16.
 */
public class HW_ArraysExampl6 {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i=0;i<10; i++){
            array[i]=(int)(Math.random()*100);
            System.out.println(array[i]+",");
        }
        int min=array[1];
        int max=array[1];
        for (int i=0;i<10; i++){
            if (array[i]<min){
                min=array[i];
            }
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Min element= "+min);
        System.out.println("Max element= "+max);
    }

}
