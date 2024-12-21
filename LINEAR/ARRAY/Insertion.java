package Array;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[] arr = {1,2,4,5};
        System.out.println("Original Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("\n Enter the element want to insert: ");
        int element = input.nextInt();
        System.out.println("Enter the position to insert: (0-based index): ");
        int position = input.nextInt();
        int[] newArr = new int[arr.length + 1];


        for (int i = 0; i < position; i++){
            newArr[i] = arr[i];
        }
        newArr[position] = element;

        for (int i = position; i < arr.length;i++){
            newArr[i + 1] = arr[i];
        }
        System.out.println("Array After Insertion: ");
        for (int num : newArr){
            System.out.print(num + " ");
        }
    }
}
