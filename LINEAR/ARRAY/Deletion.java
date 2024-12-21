package Array;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your array Size");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");

        for (int i = 0 ; i < n; i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Array Before Deletion");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("\n Enter The Index To Delete: ");
        int deleteIndex = input.nextInt();
        if (deleteIndex < 0 || deleteIndex >= n){
            System.out.println("Invalid Index");
        }else {
            for (int i = deleteIndex; i<n- 1;i++){
                arr[i] = arr[i+1];
                n--;
            }
            System.out.println("After Deletion of The Index");
            for(int num : arr){
                System.out.println(num +" ");
            }
        }
    }
}
