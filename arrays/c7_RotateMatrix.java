package ctc.arrays;

import java.util.ArrayList;

/**
 * Created by Siddarthan on 22-Jan-17.
 */
public class c7_RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] output = rotateMatrix(matrix);
        for (int i = 0; i < output.length;i++){
            for (int j = 0; j < output[0].length;j++){
                System.out.print(output[i][j]+"   ");
            }
            System.out.println("");
        }
    }

    public static int[][] rotateMatrix(int[][] matrix){
        matrix = invertMatrix(matrix);
        return reverseMatrix(matrix);
    }

    private static int[][] invertMatrix(int[][] input){
        for(int i = 0; i < input.length; i++){
            for(int j = i; j< input[0].length; j++){
                int temp = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = temp;
            }
        }
        return input;
    }

    private static int[][] reverseMatrix(int[][] input){
        int lastIndex = input[0].length-1;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[0].length/2;j++){
                int temp = input[i][j];
                input[i][j] = input[i][lastIndex-j];
                input[i][lastIndex-j] = temp;
            }
        }
        return input;
    }
}
