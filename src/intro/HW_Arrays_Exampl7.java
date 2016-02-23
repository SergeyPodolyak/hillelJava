package intro;

/**
 * Created by ADMIN on 17.02.16.
 */
public class HW_Arrays_Exampl7 {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i=0;i<10; i++){
            array[i]=(int)(Math.random()*100);
            System.out.println(array[i]+",");
        }
        int sumEven=0;
        int sumNotEven=0;
        for (int i=0;i<10; i++){
            if (array[i]%2>0){
                sumNotEven=sumNotEven+array[i] ;
            }else {sumEven=sumEven+array[i];}

            }
        System.out.println("Sum of even element= "+sumEven);
        System.out.println("Sum of noteven element= "+sumNotEven);
        }

    }


