package Array;

import java.util.Scanner;

public class Traversal2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Rows");
        int Rows = input.nextInt();
        System.out.println("and Columns");
        int Columns = input.nextInt();
        System.out.println("Please Enter The Row And Columns");
        int[][] arr = new int[Rows][Columns];
        for (int i = 0 ; i < Rows;i++ ){
            for (int j = 0; j < Columns; j++){
                arr [i][j] = input.nextInt();
            }
        }
        System.out.println("Your Array Is");
        for(int i = 0 ; i < Rows; i++){
            for (int j = 0; j < Columns;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
