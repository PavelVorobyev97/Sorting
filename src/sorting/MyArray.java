package sorting;

import java.util.Arrays;

public class MyArray {

    public int arr[] = {67, 12, 58, 97, -10, 45, 12, 61, 0, 68};
    public String strArr[] = {"cat", "dog", "cock", "horse", "zebra"};

    //сорттровка вставками O(n^2)
    public void insertSort() {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void selectSort() {
        int min_i, tmp;
        
        for (int i = 0; i < arr.length; i++) {
            min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_i]) {
                    min_i = j;
                }
                tmp = arr[i];  
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
