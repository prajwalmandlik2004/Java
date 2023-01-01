// import java.util.*;

// public class Ass_10 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         Car_Factory obj;
//         int ch, temp;

//         do {
//             System.out.println("----------------------------------------\n");
//             System.out.println("Which type of car you want to see ?\n");
//             System.out.println("----------------------------------------\n");
//             System.out.println("1 : HatchBack Car\n");
//             System.out.println("2 : Sedan Car\n");
//             System.out.println("3 : SUV Car\n");
//             System.out.println("Enter your choice : ");
//             ch = sc.nextInt();

//             switch (ch) {
//                 case 1:
//                     obj = new HatchBack();
//                     obj.input();
//                     obj.display(obj);
//                     break;

//                 case 2:
//                     obj = new Sedan();
//                     obj.input();
//                     obj.display(obj);
//                     break;

//                 case 3:
//                     obj = new SUV();
//                     obj.input();
//                     obj.display(obj);
//                     break;

//                 default:
//                     System.out.println("Please enter valid choice !");
//                     break;

//             }

//             System.out.println("Do you want to continue enter 1 and 0 to exit : ");
//             temp = sc.nextInt();

//         } while (temp == 1);

//     }
// }

// abstract class Car_Factory {
//     String Company, car_name;
//     double Budget;

//     abstract void getPrice(double Price);

//     abstract void details(String Company_Name, String Car_Name);

//     abstract void accessories();

//     void input() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("\nEnter Company Name : ");
//         Company = sc.next();
//         System.out.println("Enter Car Name : ");
//         car_name = sc.next();
//         System.out.println("Enter Budget in Lakhs : ");
//         Budget = sc.nextDouble();

//     }

//     void display(Car_Factory obj1) {
//         System.out.println("\n");
//         obj1.getPrice(Budget);
//         System.out.println("\n");
//         obj1.details(Company, car_name);
//         System.out.println("\n");
//         obj1.accessories();
//         System.out.println("\n");
//     }
// }

// class HatchBack extends Car_Factory {
//     String ans;

//     public void getPrice(double Price) {
//         if (Price > 2 && Price < 5) {
//             ans = "No";
//         } else {
//             ans = "Yes";
//         }
//     }

//     public void details(String Company_Name, String Car_Name) {
//         System.out.println("--------- HatchBack Car ----------\n");
//         System.out.println("Car Details : \n");
//         System.out.println("Company : " + Company_Name);
//         System.out.println("Car : " + Car_Name);
//         System.out.println("Color : White / Black / Grey / Red");
//         System.out.println("Fuel : Petrol");
//         System.out.println("Gears : Manual");
//     }

//     public void accessories() {
//         System.out.println("Car Accessories : \n");
//         System.out.println("Types of tyres : Alloy Tyres ");
//         System.out.println("Air Bags : " + ans);
//         System.out.println("Back Wiper : " + ans);
//         System.out.println("Side Mirror : Two ");
//         System.out.println("Touch screen music player : " + ans);
//     }

// }

// class Sedan extends Car_Factory {
//     String ans;

//     public void getPrice(double Price) {
//         if (Price > 6 && Price < 10) {
//             ans = "No";
//         } else {
//             ans = "Yes";
//         }
//     }

//     public void details(String Company_Name, String Car_Name) {
//         System.out.println("--------- Sedan Car ----------\n");
//         System.out.println("Car Details : \n");
//         System.out.println("Company : " + Company_Name);
//         System.out.println("Car : " + Car_Name);
//         System.out.println("Color : White / Black / Grey / Red");
//         System.out.println("Fuel : Petrol");
//         System.out.println("Gears : Manual");

//     }

//     public void accessories() {
//         System.out.println("Car Accessories : \n");
//         System.out.println("Types of tyres : Alloy Tyres ");
//         System.out.println("Air Bags : " + ans);
//         System.out.println("Back Wiper : " + ans);
//         System.out.println("Side Mirror : Two ");
//         System.out.println("Touch screen music player : " + ans);
//         System.out.println("Roof Window : " + ans);
//     }

// }

// class SUV extends Car_Factory {
//     String ans;

//     public void getPrice(double Price) {
//         if (Price > 10 && Price < 14) {
//             ans = "No";
//         } else {
//             ans = "Yes";
//         }
//     }

//     public void details(String Company_Name, String Car_Name) {
//         System.out.println("--------- SUV Car ----------\n");
//         System.out.println("Car Details : \n");
//         System.out.println("Company : " + Company_Name);
//         System.out.println("Car : " + Car_Name);
//         System.out.println("Color : White / Black / Grey / Red");
//         System.out.println("Fuel : Petrol");
//         System.out.println("Gears : Manual");
//     }

//     public void accessories() {
//         System.out.println("Car Accessories : \n");
//         System.out.println("Types of tyres : Alloy Tyres ");
//         System.out.println("Air Bags : " + ans);
//         System.out.println("Back Wiper : " + ans);
//         System.out.println("Side Mirror : Two ");
//         System.out.println("Touch screen music player : " + ans);
//         System.out.println("Roof Window : " + ans);
//         System.out.println("Automotive air freshner : " + ans);
//         System.out.println("Button Start : " + ans);
//     }

// }
