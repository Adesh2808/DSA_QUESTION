package Array;

import java.util.Scanner;

public class ReversingAnArray {
    public static void reverse(int[] arr, int Start, int end) {
        while (Start < end) {
            int temp = arr[Start];
            arr[Start] = arr[end];
            arr[end] = temp;
            Start++;
            end--;
        }
    }
    public static void PrintArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }



        public static void main (String[]args){
            Scanner Input = new Scanner(System.in);
            System.out.println("Please Enter Your Array Size");
            int n = Input.nextInt();
            int[] arr = new int[n];
            System.out.println("Please Enter Numbers You Want To Be IN Array");
            for (int i = 0; i < n; i++) {
                arr[i] = Input.nextInt();
            }
            reverse(arr, 0, arr.length - 1);
            System.out.println("Your Reversed Array is");
            PrintArray(arr);

        }
    }

