// converting decimals to binary, octal and hex

package converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();
       int base = scanner.nextInt();
       switch(base) {
           case 2:
           System.out.print("0b");
           decToBin(num);
           break;
           case 8:
           System.out.print("0");
           decToOctal(num);
           break;
           case 16:
           System.out.print("0x");
           decToHex(num);
           break;
       }

    }

static void decToHex(int n) {
 int i = 0,d = 0;
        String hx="",h="";
        if (n == 0)
            hx = "0";
        while(n>0)
        {
            d = n % 16;
            n = n / 16;
            if(d == 10) h = "a";
            else if(d == 11) h = "b";
            else if(d == 12) h = "c";
            else if(d == 13) h = "d";
            else if(d == 14) h= "e";
            else if(d == 15) h = "f";
            else h = "" + d;
            hx = "" + h + hx;
        }
        System.out.println(hx);

}
/*
To convert integer to binary, start with the integer in question and divide it by 2
keeping notice of the quotient and the remainder. Continue dividing the quotient
by 2 until you get a quotient of zero. Then just write out the remainders in the
reverse order. Similarly for the other conversions in this program
*/
static void decToBin(int n) {
    // array to store binary number
        int[] binNum = new int[100];
     // counter for binary number array
        int i = 0;
        if (n == 0)
            System.out.println(0);
        while (n != 0)
        {
            // storing remainder in binary array
            binNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        // Printing binary number array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binNum[j]);

    }
static void decToOctal(int n) {
        // array to store octal number
        int[] octalNum = new int[100];
        // counter for octal number array
        int i = 0;
        if (n == 0)
            System.out.println(0);
        while (n != 0)
        {
            // storing remainder in octal array
            octalNum[i] = n % 8;
            n = n / 8;
            i++;
        }
        // Printing octal number array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }
}
