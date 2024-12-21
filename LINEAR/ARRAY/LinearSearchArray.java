package Array;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter The array size");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("\nEnter The No. You Want To Search : ");
        int Target = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == Target) {
                System.out.println("Your array is found at index"   + i);
                return;
            }
        }
            System.out.println("Element is not Found");
        }
    }