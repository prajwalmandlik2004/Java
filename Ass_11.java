// import java.util.*;

// public class Ass_11 {
//     public static void main(String[] args){

//         int ch , temp , amount = 0;
//         Order order;
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.println("\n------ !! Shopping Cart !! -------\n");
//             System.out.println("1 : Credit Card");
//             System.out.println("2 : PayPal ");
//             System.out.println("3 : Bitcoin ");
//             System.out.println("\nEnter your choice : ");
//             ch = sc.nextInt();

//             if(ch==1 || ch==2 || ch==3){
//                 System.out.println("Enter the amount you want to be transfer : ");
//                 amount = sc.nextInt();
//             }

//             switch(ch){
//                 case 1 :
//                 order = new Order(amount, new creditCard());
//                 order.process();
//                 break;

//                 case 2:
//                 order = new Order(amount , new payPal());
//                 order.process();
//                 break;

//                 case 3:
//                 order = new Order(amount, new bitcoin());
//                 order.process();
//                 break;

//                 default:
//                 System.out.println("Enter the valid data !");
//                 break;

//             }

//             System.out.println("\nEnter 1 to continue and 0 to exit : ");
//             temp = sc.nextInt();

//         }while(temp==1);

//         System.out.println("\n--------- !! Thank You For Shopping !! -----------\n");

//     }
// }

// class Order{

//     private final PaymentProcessor paymentProcessor;
//     private final int amount;

//     public Order(int amount , PaymentProcessor paymentProcessor){
//         this.amount = amount;
//         this.paymentProcessor = paymentProcessor;
//     }
//     public void process(){
//         paymentProcessor.pay(amount);
//     }

// }


// interface PaymentProcessor{
//     void pay(int amount);
// }

// class creditCard implements PaymentProcessor{
//     Scanner sc = new Scanner(System.in);
//     String name , expDate;
//     double cardNo;

//     creditCard(){
//         super();
//         System.out.println("Enter Card Holder Name : ");
//         this.name = sc.next();
//         System.out.println("Enter Card No : ");
//         this.cardNo = sc.nextDouble();
//         System.out.println("Enter Expiry Date : ");
//         this.expDate = sc.next();
//     }



//     public void pay(int amount){

//         System.out.println("Payment through credit card : $" + amount);

//     }
// }

// class payPal implements PaymentProcessor{

//     payPal(){
//         super();
//         System.out.println("Checking for the internet connection ... ");
//     }

//     public void pay(int amount){
//         System.out.println("Payment through PayPal : $" + amount);
//     }
// }

// class bitcoin implements PaymentProcessor{
//     Scanner sc = new Scanner (System.in);

//     String add;

//     bitcoin(){
//         System.out.println("Enter the input adress : ");
//         add = sc.next();
//     }

//     public void pay(int amount){
//         System.out.println("Payment through the bitcoin : $" + amount);
//     }
// }

