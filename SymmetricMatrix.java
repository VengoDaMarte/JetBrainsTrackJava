// Check whether this matrix is symmetric in relation to the main diagonal

import java.util.Scanner;

class SymmatricMatrix {
    public static void main(String[] args) {
        boolean symmetric = true;
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        int[][] matrix = new int[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        outer: {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        symmetric = false;
                        break outer;
                    }
                }
            }
        }
        if (symmetric) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
