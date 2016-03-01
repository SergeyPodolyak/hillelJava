package OOP;

import java.util.Arrays;

/**
 * Created by ADMIN on 02.03.16.
 */
public class ImprovedArray {
    private String[] array;
    private int arrayCounter;

    public ImprovedArray() {
        this.array = new String[2];
        this.arrayCounter = 0;
    }

    public void add(String value) {
        if (this.arrayCounter >= this.array.length) {
            String[] someNewArray = new String[this.array.length * 2];
            System.arraycopy(this.array,0,someNewArray,0,this.array.length);
            //someNewArray = Arrays.copyOf(this.array, this.array.length);
            this.array = someNewArray;
            this.array[arrayCounter] = value;
            this.arrayCounter = this.arrayCounter + 1;
        } else {
            this.array[this.arrayCounter] = value;
            this.arrayCounter = this.arrayCounter + 1;
        }
    }
    public void showElements(){
        for (int i=0; i<this.arrayCounter;i++){
            System.out.println(this.array[i]);

        }
    }




}
