package Array;

import java.util.Scanner;

public class TransposeOf2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Rows");
        int Row = input.nextInt();
        System.out.println("Please Enter col");
        int Col = input.nextInt();
        int[][] matrix = new int[Row][Col];
        int[][] transpose = new int [Col][Row];
        System.out.println("Please Enter Your Array");
        for (int i = 0; i<Row;i++){
            for (int j = 0 ; j < Col; j++){
                System.out.println("Please Enter ["+i+"]["+j+"]:");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Your array is:");
        for (int i = 0; i < Row; i++){
            for (int j = 0; j < Col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<Row;i++) {
            for (int j = 0; j < Col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed array is");
        for (int i = 0 ; i <  Col; i++){
            for(int j = 0; j < Row; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
