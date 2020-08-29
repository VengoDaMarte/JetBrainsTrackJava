/*I
mplement a function for preparing full name. T
he function takes two string arguments: firstName and lastName.
You need to concat them together with a space in the middle.i
*/

mport java.util.Scanner;

public class Name {

    public static String prepareFullName(String firstName, String lastName) {
        if (firstName == null) {
            return lastName;
        } else if (lastName == null) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}

// public class Name {
//
//     public static String prepareFullName(String firstName, String lastName) {
//         String fullName = "";
//
//         if (firstName != null) {
//             fullName += firstName + " ";
//         }
//
//         if (lastName != null) {
//             fullName += lastName;
//         }
//
//         return fullName.trim();
//     }
//
//     /* Do not change code below */
//     public static void main(String[] args) {
//         final Scanner scanner = new Scanner(System.in);
//
//         String firstName = scanner.nextLine();
//         firstName = "null".equals(firstName) ? null : firstName;
//
//         String lastName = scanner.nextLine();
//         lastName = "null".equals(lastName) ? null : lastName;
//
//         System.out.println(prepareFullName(firstName, lastName));
//     }
// }
