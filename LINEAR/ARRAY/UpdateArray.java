package Array;

import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Array Size");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Please Enter The Array Numbers");
        for (int i = 0 ; i < n ;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("\nThe Array You Provided: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("\nPlease Enter The No. You Want To Update IN Your Array ");
        int ExistingValue = input.nextInt();
        System.out.println("Please Enter The index" + (arr.length-1) + "):");
        int index = input.nextInt();
        System.out.println("Please Enter The Value to Update");
        int NewValue = input.nextInt();
        if (index >= 0 && index < arr.length) {
            arr[index] = NewValue;
            for (int num : arr){
                System.out.print(num + " ");
            }
        }else {
            System.out.println("Element Is not Found In this Array");
        }
    }
}
