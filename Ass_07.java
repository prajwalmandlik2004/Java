// import java.util.*;

// public class Ass_07 {
//     public static void main(String[] args) {

//         String s;
//         Scanner sc = new Scanner(System.in);
//         int ch, d;
//         do {
//             System.out.println("\n---!! Enter your choice !!---\n");
//             System.out.println("Menu\t\tOperations\n");
//             System.out.println("1\t :   Check for String !\n");
//             System.out.println("2\t :   Check for Integer !\n");

//             System.out.println("Enter your choice : ");
//             ch = sc.nextInt();

//             switch (ch) {
//                 case 1:
//                     System.out.println("Enter the string :");
//                     s = sc.next();
//                     Number.palindrome(s);
//                     break;

//                 case 2:
//                     System.out.println("Enter the Integer :");
//                     s = sc.next();
//                     Number.palindrome(s);
//                     Number.evenodd(Integer.parseInt(s));
//                     Number.prime(Integer.parseInt(s));
//                     break;

//                 default:
//                     System.out.println("Enter valid Choice !");
//             }

//             System.out.println("\nEnter 1 to continue and 0 to exit : ");
//             d = sc.nextInt();
//             System.out.println("\n");
//         } while (d == 1);
//         System.out.println("!! End of Program !!");
//     }
// }

// class Number {

//     public static <T> void palindrome(T s) {
//         String s1 = (String) s;

//         StringBuffer s2 = new StringBuffer(s1);
//         String s3 = new String(s2.reverse());

//         if (Objects.equals(s1, s3)) {
//             System.out.println(s + " is Palindrome");
//         } else {
//             System.out.println(s + " is not Palindrome");
//         }

//     }

//     public static <T> void evenodd(T a) {
//         if ((int) a % 2 == 0) {
//             System.out.println(a + " is Even number !");
//         } else {
//             System.out.println(a + " is Odd number !");
//         }
//     }

//     public static <T> void prime(T a) {

//         if ((int) a == 1) {
//             System.out.println(a + " is not a Prime number !");
//         } else if ((int) a == 2) {
//             System.out.println(a + " is a Prime number !");
//         } else if ((int) a % 2 == 0 && (int) a > 2) {
//             System.out.println(a + " is not a Prime number !");
//         } else {
//             double b = Math.sqrt((int) a) + 1;
//             int temp = 0;
//             for (int i = 3; i < b; i = i + 2) {
//                 if ((int) a % i == 0) {
//                     temp = 1;
//                 }
//             }
//             if (temp == 1) {
//                 System.out.println(a + " is not a Prime number !");
//             } else {
//                 System.out.println(a + " is a Prime number !");
//             }
//         }

//     }

// }
