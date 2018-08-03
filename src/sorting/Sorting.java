package sorting;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        MyArray a = new MyArray();
        System.out.println(Arrays.toString(a.arr));
        //a.insertSort();
        a.selectSort();
    }
    
}
