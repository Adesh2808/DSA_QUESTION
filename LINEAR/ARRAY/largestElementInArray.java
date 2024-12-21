package Array;

import java.util.Scanner;

public class largestElementInArray {
    public static void Largest(int[]arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++ ){
            if(largest < arr[i]){
                largest = arr[i];

            }

        }
        System.out.println("\nThe Largest Number In Your Array Is" + largest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Array Size");
        int n = input.nextInt();
        System.out.println("Please Enter Your Array");
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("The Array You Provided");
        for (int num:arr){
            System.out.print(num + " ");
        }
        Largest(arr);
    }
}
