/**
 * Created by User on 16.02.2016.
 */
public class Array2 {
    public static void main(String[] args) {
        int[] array = {11,4,5,1,7,8};

for (int i=0; i<6; i++){
    System.out.println(array[i]);
    if (array[i]==7) {
    break;
    }


}
        System.out.println("Cotinue cycle");
        for (int i=0; i<6; i++){

            if (array[i]==4) {
                continue;
            }
            System.out.println(array[i]);
        }
int min=array[0];
for(int element:array){
    if (element<min){
        min=element;
    }
}
        System.out.println("min=" + min);
    }
}
