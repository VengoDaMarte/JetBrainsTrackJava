/*
A right rotation is an operation that shifts each element of an array to the right. For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}. If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

Write a program, that performs a right rotation on an array by a given number.

Input format:
The first line is an array of numbers.
The second line is the number of rotations.
Output format:
Resulting array

 Report a typo
Sample Input 1:
1 2 3 4 5
1
Sample Output 1:
5 1 2 3 4

Sample Input 2:
1 2 3 4 5
2
Sample Output 2:
4 5 1 2 3


*/


import java.util.Scanner;
class Rotation {
    static Scanner in = new Scanner(System.in);

    public static int[] getArray() {
        String input = in.nextLine();
        String[] stringArray = input.split(" ");
        final int SIZE = stringArray.length;
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] myArray = getArray();
        int i, j;
        int shift = in.nextInt();
        int size = myArray.length;
        if (size == 1) {
            System.out.println(myArray[0]);
        }
        if (shift > size) {
            shift = shift % size;
        }
        // copy elements to be shifted in temp
        int[] temp = new int[shift];
        for (i = size - 1, j = shift - 1; i >= size - shift & j >= 0; i--, j--) {
            temp[j] = myArray[i];
        }
        // shift all elements except for the first n which will be replaced by what temp holds
        for (i = size - 1; i >= shift; i--) {
            myArray[i] = myArray[i - shift];
        }
        // copy contents of temp to front of array
        for (i = 0; i < temp.length; i++) {
            myArray[i] = temp[i];
        }
        System.out.println();
        for (int num: myArray) {
            System.out.print(num + " ");
        }

    }

}
/* alternative

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbersString = input.nextLine();
        String[] arrayOfNumbersString = numbersString.split(" ");
        String[] newArrayOfNumbers = new String[arrayOfNumbersString.length];
        int numberOfRotations = input.nextInt();

        for (int i = 0; i < arrayOfNumbersString.length; i++) {
            newArrayOfNumbers[(i + numberOfRotations) % arrayOfNumbersString.length] = arrayOfNumbersString[i];
        }

        for (String number : newArrayOfNumbers) {
            System.out.print(number + " ");
        }
    }
}
*/
