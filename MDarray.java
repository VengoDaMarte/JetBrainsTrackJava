// Find the indexes of the initial appearance of the maximum element in a matrix

import java.util.Scanner;

public class MDarray {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int iMax = 0;
        int jMax = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[iMax][jMax] < matrix[i][j]) {
                    iMax = i;
                    jMax = j;
                }
            }
        }

        System.out.println(iMax + " " + jMax);
    }
}
/*
I like the use of int max = Integer.MIN_VALUE

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int[][] array = new int[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int rowIndex = 0;
        int columnIndex = 0;
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.println(rowIndex + " " + columnIndex);
    }
}
*/
