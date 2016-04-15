package OOP;

import exception.MyOwnOutOfIndexException;

import java.util.Arrays;

/**
 * Created by ADMIN on 02.03.16.
 */
public class ImprovedArray {
    private String[] array;
    private int arrayCounter;

    //Object constructor
    public ImprovedArray(int length) {
        this.array = new String[length];
        this.arrayCounter = 0;
    }

    //Method to add element to the array
    public void add(String value) {
        if (this.arrayCounter >= this.array.length) {
            String[] someNewArray = new String[this.array.length * 2];
            System.arraycopy(this.array, 0, someNewArray, 0, this.array.length);
            this.array = someNewArray;
            this.array[arrayCounter] = value;
            this.arrayCounter = this.arrayCounter + 1;
        } else {
            this.array[this.arrayCounter] = value;
            this.arrayCounter = this.arrayCounter + 1;
        }
    }

    //The output of the requested element
    public String get(int index) throws MyOwnOutOfIndexException{
        String someElement="";
        if (arrayCounter==0){
        throw new MyOwnOutOfIndexException("Improved array is empty");
       }
        if (index < this.arrayCounter) {
            someElement = this.array[index];
        } else {
            throw new MyOwnOutOfIndexException("Index not in the diapazon");

        }







return someElement;
    }

    //The number of filled elements
    public int size() {
        return this.arrayCounter;
    }

    //View of array elements
    public String toString() {
        String beautifulstring = new String();
        for (int i = 0; i < this.arrayCounter; i++) {
            beautifulstring = beautifulstring + " " + this.array[i];
        }
        return beautifulstring;
    }

    // A comparison of two objects
    public boolean equals(ImprovedArray other) {
        boolean answer = false;
        if (this.array.length == other.array.length) {
            if (this.arrayCounter == other.arrayCounter) {
                for (int i = 0; i < this.arrayCounter; i++) {
                    if (this.array[i].equals(other.array[i])) {
                        answer = true;
                    } else {
                        answer = false;
                        break;
                    }
                }
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }
        return answer;
    }


}
