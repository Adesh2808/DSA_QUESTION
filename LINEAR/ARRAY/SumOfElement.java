package Array;

import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Input the Size OF your Array ");
        int n = input.nextInt();
        System.out.println("Please Enter Array Numbers ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++ ){
            arr[i] = input.nextInt();
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("\nSum Of Your Array IS : " );
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            sum += arr[i] ;
        }
        System.out.println(sum);

    }
}
