package Array;

import java.util.Scanner;

public class SecondLargestElement {
    public static void FindSecondMax(int[]arr,int max,int SecondMax){
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                SecondMax = max;
                max = arr[i];

            } else if (arr[i] > SecondMax && arr[i] != max) {
                SecondMax = arr[i];
            }
        }
        System.out.println("Your Second Maximum is: " + SecondMax);
    }






    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Array Size");
        int n = input.nextInt();
        System.out.println("Please Enter Your Arrays");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Your Array Is");
        for (int num : arr){
            System.out.print(num +" ");
        }
        FindSecondMax(arr,Integer.MIN_VALUE,Integer.MIN_VALUE);
    }
}

