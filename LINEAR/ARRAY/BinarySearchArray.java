package Array;

import java.util.Scanner;

public class BinarySearchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Binary Search");
        System.out.println("Please Enter Your Array Size");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Please Enter Your Numbers");
        for (int i = 0; i < n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Your Array is : ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("Please Enter You Want To Search: ");
        int Search = input.nextInt();
        int low = 0 , high = n - 1;
        boolean found = false;

        while(low <= high){
            int mid = low + (high-low) / 2;
            if (arr[mid] == Search){
                System.out.println("Element is found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < Search) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        if(!found){
            System.out.println("Element Not Found In The Array");
        }
    }
}
