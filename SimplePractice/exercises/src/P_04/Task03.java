import java.util.Arrays;
import java.util.Random;

public class Task03 {
    private static int[][] fillMatrixWithRandom(int[][] array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[0].length; j++) {
                array[i][j] = rnd.nextInt(0, 50);
            }
        }
        return array;
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");

        }
    }

    public static void main(String[] args) {
        int m = 12, n = 8;
        int[][] matrix = new int[m][n];
        matrix = fillMatrixWithRandom(matrix);
        printMatrix(matrix);
        int maxIndex = 0, maxSum = 0, sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = Arrays.stream(matrix[i]).sum();
            if(maxSum < sum){
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.printf("Max sum %d - line %d", maxSum, maxIndex);;
    }

}
