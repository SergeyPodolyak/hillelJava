/**
 * Created by ADMIN on 01.01.02.
 */
public class HW_ArraysExampl8 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int[] c= new int[3];
        int[] d= new int[3];
        int sum1=0;
        int sum2=0;
        for (int i=100000; i<1000000; i++){
            a=i/1000;
            b=i%1000;
            for (int j=2;j>-1;j--){
                c[j]=a%10;
                a=a/10;
                d[j]=b%10;
                b=b/10;
            }
            sum1=0;
            sum2=0;
            for (int y=0; y<3; y++){
                sum1=sum1+c[y];
                sum2=sum2+d[y];

            }
            if (sum1==sum2){
                System.out.println("Luky tikket"+i);
            }
        }
    }
}
