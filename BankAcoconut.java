import java.util.*;

public class BankAcoconut{
   public static void main(String [] args){
      Scanner bato = new Scanner(System.in);
      
      float dep;
      double with;
      int ch = 0;
      int ch2 = 0;
      
      System.out.println("Welcome to Bank of Bikini Bottom Bank!");
      System.out.println("");
      
      SavingsAccount s1 = new SavingsAccount();
      CurrentAccount c1 = new CurrentAccount();
      
      while (ch != 3){
         System.out.println(s1);
         System.out.println(c1);
         System.out.println("Select Service: 1 = Deposit || 2 = Withdraw || 3 = Exit");
         ch = bato.nextInt();
         System.out.println("");
         switch(ch){
            case 1: //deposit
               System.out.println("Deposit from which account?");
               System.out.println("1 = Savings Account || 2 = Current Account || 3 = Exit");
               ch2 = bato.nextInt();
               System.out.println("");
               
            
               switch(ch2){     
                  case 1: //DEPOSIT TIME!!!!!!!!!!!!!!!!!!!!!! TO SAVINGS!@@@@@@!@!@11122
                  
                     System.out.println("Input Savings Account Deposit: ");
                     dep = bato.nextFloat();
                     s1.dep = dep;
                     s1.deposit();
                     
                     System.out.println("Continue another transaction? 1 = Y || 3 = N");
                     ch = bato.nextInt();
                     System.out.println("");
                     
                     break;
                  
                  case 2: //TNERRUC OT !!!!!!!!!!!!!!!!!!!!!!!!!!! ENIT TUSOPED!!!!!!!!!!!!!!
                  
                     System.out.println("Input Current Account Deposit: ");
                     dep = bato.nextFloat();
                     
                     c1.dep = dep;
                     c1.deposit();
                     
                     System.out.println("Continue another transaction? 1 = Y || 3 = N");
                     ch = bato.nextInt();
                     System.out.println("");
                     
                     break;
                     
                  case 3: //return to deposit or withdraw option
                     break;
                     
                  default:
                     break;
               }
               
               break;
               
            case 2: //withdraw
               System.out.println("Withdraw from which account?");
               System.out.println("1 = Savings Account || 2 = Current Account || 3 = Exit");
               ch2 = bato.nextInt();
               System.out.println("");
               
            
               switch(ch2){     
                  case 1: //this case withdraws from the savings account, im sure of it!!!
                  
                     System.out.println("Input Savings Account Withdrawal Amount: ");
                     with = bato.nextDouble();
                     s1.with = with;
                     s1.withdraw();
                     
                     System.out.println("Continue another transaction? 1 = Y || 3 = N");
                     ch = bato.nextInt();
                     System.out.println("");
                     
                     break;
                  
                  case 2: //this case withdraws from the current account, i think...
                  
                     System.out.println("Input Current Account Withdrawal Amount: ");
                     with = bato.nextDouble();
                     
                     c1.with = with;
                     c1.withdraw();
                     
                     System.out.println("Continue another transaction? 1 = Y || 3 = N");
                     ch = bato.nextInt();
                     System.out.println("");
                     
                     break;
                     
                  case 3: //same goes here
                     break;
                     
                  default:
                     break;
               }
               
               break;
               
            case 3:
               break;
               
            default:
               break;
         }
      }
      
      System.out.println("Thank you for visiting The Bank of Bikini Bottom Bank!");
   }
}

/*honestly CYN WOULD LOVVE THIIISSSS CODE too FaILLL, solvERR WIlL love EARTH VERY muCh, and i CAN HAVE NEW host very fun!!!
yipeEEE!! I hope TESSsa seE THIS teeHEE!!!!*/