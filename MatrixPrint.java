
// Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix)
// from n×n elements, by filling it with "." symbols (each element of the matrix is a string
// containing a single symbol). Then fill the middle row of the matrix, the middle column,
// and the main and the secondary diagonals with the "*" symbols. As a result, all "*"s in
// the array must form the star figure. Output this matrix; elements of the array should be
// space separated.
//
// Sample Input 1:
// 5
// Sample Output 1:
// * . * . *
// . * * * .
// * * * * *
// . * * * .
// * . * . *


import java.util.Scanner;
public class MatrixPrint {

    public static void main(String[] args) {
    //put your code here
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        // use String[] and matrix.length instead of dim in code to be closer
        // to implementing a matrix
        // String[][] matrix = new String[dim][dim];
        /*
        Main diagonal condition => i=j
        Secondary diagonal condition => i=n-j-1
        Middle row => (i * 2) + 1 == dim
        Middle column => (j * 2) + 1 == dim
        */
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i == j || (i * 2) + 1 == dim || (j * 2) + 1 == dim || i == dim - j - 1) {
                    System.out.print('*' + " ");
                } else {
                    System.out.print('.' + " ");
                }
            }
            System.out.println();
        }
    }
}

// I like the following version
// import java.util.Arrays;
// import java.util.Scanner;
//
// public class Main {
//
//     public static void main(String[] args) {
//         final Scanner scanner = new Scanner(System.in);
//
//         final int size = scanner.nextInt();
//         final char[][] matrix = new char[size][size];
//         for (int i = 0; i < matrix.length; i++) {
//             Arrays.fill(matrix[i], '.');
//         }
//
//         for (int i = 0; i < matrix.length; i++) {
//             matrix[i][i] = '*';
//             matrix[i][matrix.length - 1 - i] = '*';
//             matrix[i][matrix.length / 2] = '*';
//             matrix[matrix.length / 2][i] = '*';
//         }
//
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
