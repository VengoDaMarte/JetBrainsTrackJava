import java.util.Scanner;
public class Main {

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
