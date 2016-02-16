/**
 * Created by User on 16.02.2016.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1};


        System.out.println(array[1]);
        int sum=0;
        int i=0;
        while (i<=5){
            sum=sum+array[i];
                        i++;
        }
        System.out.println(sum);
    }
}
