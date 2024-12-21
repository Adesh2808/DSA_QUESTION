package Array;

import java.util.Scanner;

public class Rotating1DArray {
    public static void LeftSideRotation(int[]arr,int n){
        int first = arr[0];
        for (int i = 0 ; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
        System.out.println("\nYour Left Side Rotation Array Is");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Array Size");
        int n = input.nextInt();
        System.out.println("Please Enter Your Array Numbers");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Your Array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println("\nYour Rotated Array Is: ");
        for (int num : arr) {
            System.out.print(num + " ");

        }
    }
}
