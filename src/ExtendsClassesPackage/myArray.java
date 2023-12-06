package ExtendsClassesPackage;

import java.util.Arrays;
import java.util.Random;
public class myArray implements IMath {
    public final int[] array;
    private int size=0;
    private final Random rand = new Random();

    public myArray(int size){
        this.size=size;
       array= new int[size];
    }
    public void init(int start,int end){
        for (int i = 0; i < size; i++) {
            array[i] =rand.nextInt(start,end);
        }
    }

    @Override
    public String toString() {
        return  "myArray = " + Arrays.toString(array) ;
    }

    @Override
    public int min() {
        int number = array[0];
        for (int i : array) {
            if (number < i) {
                number = i;
            }
        }
        return number;
    }
    @Override
    public int max() {
        int number = array[0];
        for (int i : array) {
            if (number > i) {
                number = i;
            }
        }
        return number;
    }
    @Override
    public float avg() {
        float number = 0;
        for (int i : array) {
           number += i;
        }
        number = number/size;
        return number;
    }
}
