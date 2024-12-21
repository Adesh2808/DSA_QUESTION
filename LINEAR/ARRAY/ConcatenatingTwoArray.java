package Array;

import java.util.Arrays;

public class ConcatenatingTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] ConcatenatedArray = new int[arr1.length + arr2.length];
        for (int i =0; i < arr1.length; i++){
                        ConcatenatedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i ++){
            ConcatenatedArray[arr1.length + i] = arr2[i];
        }
        System.out.println("Concatenated Array:" + Arrays.toString(ConcatenatedArray));
    }
}

