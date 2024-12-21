package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Your Size of Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
