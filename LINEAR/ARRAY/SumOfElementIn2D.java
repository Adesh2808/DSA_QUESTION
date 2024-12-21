package Array;

import java.util.Scanner;

public class SumOfElementIn2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Row");
        int Row = input.nextInt();
        System.out.println("please Enter Your Column");
        int Column = input.nextInt();
        int[][] arr = new int[Row][Column];
        System.out.println("Please Enter Row And Column");
        for (int i = 0 ; i < Row;i++){
            for (int j = 0; j < Column; j++){
                System.out.println("Element At ["+i+"]["+j+"]:");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Your Array is: ");
        for (int i = 0; i < Row; i++){
            for (int j = 0; j < Column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int Sum = 0;
        for (int i = 0 ; i < Row; i ++){
            for(int j = 0; j < Column; j++){
                Sum += arr[i][j];
            }
        }
        System.out.println("\nYour Array Sum Is:" + Sum );
    }
}
