// import java.util.Scanner;

// // import javax.swing.event.SwingPropertyChangeSupport;
// public class Ass_03 {
//     public static void main(String[] args) {
//         int choice, cont;
//         do {
//             System.out.println("__! PayRoll !__");
//             System.out.println("1] Programmer \t 2] TeamLead \t 3]Assistant Project Manager \t 4] Manager");
//             Scanner pro = new Scanner(System.in);
//             System.out.println("Enter your choice : ");
//             choice = pro.nextInt();
//             switch (choice) {
//                 case 1: {
//                     Programmer p = new Programmer();
//                     p.getData();
//                     p.getProgrammer();
//                     p.displayData();
//                     p.calculateProgrammer();
//                     break;
//                 }
//                 case 2: {
//                     Teamlead t = new Teamlead();
//                     t.getData();
//                     t.getTeamlead();
//                     t.displayData();
//                     t.calculateTeamlead();
//                     break;
//                 }
//                 case 3: {
//                     Assitant_Project_Manager a = new Assitant_Project_Manager();
//                     a.getData();
//                     a.getAssitant_Project_Manager();
//                     a.displayData();
//                     a.calculateAssitant_Project_Manager();
//                     break;
//                 }
//                 case 4: {
//                     Manager m = new Manager();
//                     m.getData();
//                     m.getManager();
//                     m.displayData();
//                     m.calculateManager();
//                     break;
//                 }
//             }
//             System.out.println("Enter 0 to Quite and 1 to Continue :");
//             cont = pro.nextInt();
//         } while (cont == 1);
//     }
// }

// class Employee {
//     String emp_name, emp_adress, emp_mail;
//     long emp_mobile_no;
//     int emp_id;

//     Scanner emp = new Scanner(System.in);

//     void getData() {
//         System.out.println("Enter the name of the employee : ");
//         emp_name = emp.nextLine();
//         System.out.println("Enter the adress of the employee : ");
//         emp_adress = emp.nextLine();
//         System.out.println("Enter the mail id of the employee : ");
//         emp_mail = emp.nextLine();
//         System.out.println("Enter the mobile number of the employee : ");
//         emp_mobile_no = emp.nextLong();
//         System.out.println("Enter the ID of the employee : ");
//         emp_id = emp.nextInt();
//     }

//     void displayData() {
//         System.out.println("Name of the employee is : " + emp_name);
//         System.out.println("Adress of the employee is : " + emp_adress);
//         System.out.println("Mail ID of the employee is : " + emp_mail);
//         System.out.println("Mobile Number of the employee is : " + emp_mobile_no);
//         System.out.println("ID of the employee is : " + emp_id);
//     }
// }

// class Programmer extends Employee {
//     double salary, basic_pay, DA, HRA, PF, SCF, gros_salary, net_slary;

//     void getProgrammer() {
//         System.out.println("Enter basic pay of the employee : ");
//         basic_pay = emp.nextDouble();
//     }

//     void calculateProgrammer() {
//         DA = (0.97 * basic_pay);
//         HRA = (0.10 * basic_pay);
//         PF = (0.12 * basic_pay);
//         SCF = (0.1 * basic_pay);
//         gros_salary = (basic_pay + DA + HRA);
//         net_slary = (gros_salary - PF - SCF);
//         System.out.println("Pay Slip For Programmer : ");
//         System.out.println("Basic Pay : " + basic_pay);
//         System.out.println("DA is : " + DA);
//         System.out.println("HRA is : " + HRA);
//         System.out.println("PF is : " + PF);
//         System.out.println("SCF is : " + SCF);
//         System.out.println("Gross Salary is : " + gros_salary);
//         System.out.println("Net Salary is : " + net_slary);

//     }

// }

// class Teamlead extends Employee {
//     double salary, basic_pay, DA, HRA, PF, SCF, gros_salary, net_slary;

//     void getTeamlead() {
//         System.out.println("Enter basic pay of the employee : ");
//         basic_pay = emp.nextDouble();
//     }

//     void calculateTeamlead() {
//         DA = (0.97 * basic_pay);
//         HRA = (0.10 * basic_pay);
//         PF = (0.12 * basic_pay);
//         SCF = (0.1 * basic_pay);
//         gros_salary = (basic_pay + DA + HRA);
//         net_slary = (gros_salary - PF - SCF);
//         System.out.println("Pay Slip For Teamlead : ");
//         System.out.println("Basic Pay : " + basic_pay);
//         System.out.println("DA is : " + DA);
//         System.out.println("HRA is : " + HRA);
//         System.out.println("PF is : " + PF);
//         System.out.println("SCF is : " + SCF);
//         System.out.println("Gross Salary is : " + gros_salary);
//         System.out.println("Net Salary is : " + net_slary);

//     }

// }

// class Assitant_Project_Manager extends Employee {
//     double salary, basic_pay, DA, HRA, PF, SCF, gros_salary, net_slary;

//     void getAssitant_Project_Manager() {
//         System.out.println("Enter basic pay of the employee : ");
//         basic_pay = emp.nextDouble();
//     }

//     void calculateAssitant_Project_Manager() {
//         DA = (0.97 * basic_pay);
//         HRA = (0.10 * basic_pay);
//         PF = (0.12 * basic_pay);
//         SCF = (0.1 * basic_pay);
//         gros_salary = (basic_pay + DA + HRA);
//         net_slary = (gros_salary - PF - SCF);
//         System.out.println("Pay Slip For Assistant Project Manager : ");
//         System.out.println("Basic Pay : " + basic_pay);
//         System.out.println("DA is : " + DA);
//         System.out.println("HRA is : " + HRA);
//         System.out.println("PF is : " + PF);
//         System.out.println("SCF is : " + SCF);
//         System.out.println("Gross Salary is : " + gros_salary);
//         System.out.println("Net Salary is : " + net_slary);

//     }

// }

// class Manager extends Employee {
//     double salary, basic_pay, DA, HRA, PF, SCF, gros_salary, net_slary;

//     void getManager() {
//         System.out.println("Enter basic pay of the employee : ");
//         basic_pay = emp.nextDouble();
//     }

//     void calculateManager() {
//         DA = (0.97 * basic_pay);
//         HRA = (0.10 * basic_pay);
//         PF = (0.12 * basic_pay);
//         SCF = (0.1 * basic_pay);
//         gros_salary = (basic_pay + DA + HRA);
//         net_slary = (gros_salary - PF - SCF);
//         System.out.println("Pay Slip For Manager : ");
//         System.out.println("Basic Pay : " + basic_pay);
//         System.out.println("DA is : " + DA);
//         System.out.println("HRA is : " + HRA);
//         System.out.println("PF is : " + PF);
//         System.out.println("SCF is : " + SCF);
//         System.out.println("Gross Salary is : " + gros_salary);
//         System.out.println("Net Salary is : " + net_slary);

//     }

// }
