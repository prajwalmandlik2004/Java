
// import java.util.Scanner;

// public class Ass_09 {

// 	public static void main(String[] args) {
		
// 		int ch1, ch2;
// 		Scanner s1 = new Scanner(System.in);

// 		System.out.println("---Enter the account type---");
// 		System.out.println("1. Savings\n2. Current");
// 		ch1 = s1.nextInt();
// 		if (ch1 == 1) {
// 			Savings s = new Savings(); // object creation of savings class
// 			s.Input();
// 			int x = 1;
// 			do {
// 				System.out.println("_______________________________");
// 				System.out.println(
// 						"1. Deposit\n2. Display Balance\n3. Calculate Compound interest\n4. Withdrawl\n5. Exit");
// 				System.out.println("________________________________");
// 				ch2 = s1.nextInt();
// 				switch (ch2) {
// 				case 1:
					
// 					s.Deposit();
				
// 					s.Display();
// 					break;
// 				case 2:
					
// 					s.Display();
// 					break;
// 				case 3:
					
// 					s.compInterest();
// 					break;
// 				case 4:
					
// 					s.withdrawal();
// 					s.Display();
// 					break;
// 				case 5:
// 					x = 0;
// 					break;

// 				default:
// 					System.out.println("Invalid choice");

// 				}
// 			} while (x == 1);
// 		} else if (ch1 == 2) {
// 			Current c = new Current();
// 			c.Input();
// 			int x = 1;
// 			do {
// 				System.out.println("______________________________");
// 				System.out.println("1. Deposit\n2. Display Balance\n3. Withdrawl\n4. Deposit Chequebook\n5. Exit");
// 				System.out.println("_______________________________");
// 				ch2 = s1.nextInt();
// 				switch (ch2) {
// 				case 1:
					
// 					c.Deposit();
// 					c.Display();
// 					break;
// 				case 2:
					
// 					c.Display();
// 					break;
// 				case 3:
					
// 					c.withdrawal();
// 					c.Display();
// 					break;
// 				case 4:
					
// 					c.deposit_check();
// 					c.Display();
// 					break;
// 				case 5:
// 					x = 0;
// 					break;

// 				default:
// 					System.out.println("Invalid choice");

// 				}
// 			} while (x == 1);

// 		}
		
// 		else {
// 			System.out.println("Invalid choice");
// 		}
// 	}

// }

// class Account { 
// 	Scanner sc = new Scanner(System.in);

	
// 	String name; 
// 	int accno; 
// 	String type; 
// 	double bal; 

	
// 	void Input() {
// 		System.out.println("Enter name::");
// 		name = sc.nextLine();

// 		System.out.println("Enter Account number:: ");
// 		accno = sc.nextInt();
// 		sc.nextLine();
// 		System.out.println("Enter type of account:: ");
// 		type = sc.nextLine();

// 		System.out.println("Enter Principal amount:: ");
// 		bal = sc.nextDouble();
// 	}

	
// 	void Display() {
// 		System.out.println("________________________________________________________________");
// 		System.out.println("Name::			" + name);
// 		System.out.println("Account No::		" + accno);
// 		System.out.println("Type::			" + type);
// 		System.out.println("Balance::		" + bal);
// 		System.out.println("_________________________________________________________________");
// 	}

	
// 	void Deposit() {
// 		double amt;
// 		System.out.println("Enter the amount to be depositedt:: ");
// 		amt = sc.nextDouble();
// 		bal = bal + amt;
// 	}
// }

// class Savings extends Account { 
// 	double interest;

// 	void compInterest() { 
// 		int time;
// 		double rate;
// 		System.out.println("Enter duration (in years):: "); 
// 		time = sc.nextInt();
// 		System.out.println("Enter annual interest rate:: "); 
// 		rate = sc.nextDouble();
// 		interest = bal * Math.pow(1 + rate / 100, time) - bal; 
// 		System.out.println("The coumpount interest will be " + interest);
// 	}

// 	void withdrawal() { 
// 		double amount;
// 		System.out.println("Enter the amount to be withdrawn:: ");
// 		amount = sc.nextDouble();
// 		if (bal >= amount) {
// 			bal = bal - amount; 
// 		} else {
// 			System.out.println("The amount cannot be withdrawn!!");
// 		}
// 	}
// }

// class Current extends Account { 

// 	double penalty;

// 	int minBal() {
// 		int ret1 = 1;
// 		if (bal <= 10000) {
			
// 			penalty = 2500;
// 			bal = bal - penalty;
// 			ret1 = 0;
// 		} else {
// 			System.out.println("No penalty imposed");
// 		}
// 		return ret1;
// 	}

	
// 	void withdrawal() {
// 		double amt;
// 		System.out.println("Enter the amount to withdraw");
// 		amt = sc.nextDouble();
// 		int k = minBal();
// 		if (k == 1) {
// 			if (bal >= amt)
// 				bal = bal - amt;
// 		} else {
// 			System.out.println("The amount cannot be withdrawn");

// 		}

// 	}

	
// 	void deposit_check() {
// 		System.out.println("Enter check amount");
// 		double check_amt = sc.nextDouble();
// 		bal = bal + check_amt;
// 		System.out.println("Your cheque has been deposited and current balance becomes: " + bal);

// 	}

// }
