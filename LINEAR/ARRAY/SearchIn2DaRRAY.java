package Array;

import java.util.Scanner;

public class SearchIn2DaRRAY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Row");
        int Row = input.nextInt();
        System.out.println("Please Enter Column");
        int Column = input.nextInt();
        System.out.println("Please Enter Your Element In Array");
        int[][] arr = new int[Row][Column];
        for (int i = 0 ; i < Row ; i++){
            for (int  j = 0 ; j < Column; j++){
                System.out.println("Please Enter["+i+"]["+j+"]:");
                arr[i][j] = input.nextInt();
            }
        }
        int Target = input.nextInt();

        boolean found = false;
        for (int i = 0; i < Row; i++){
            for (int j = 0 ; j < Column; j++){
                if (Target == arr[i][j]){
                    System.out.println("Element is found at" + i + "and"+j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found){
            System.out.println("Element Is Not Found");
        }
    }
}
