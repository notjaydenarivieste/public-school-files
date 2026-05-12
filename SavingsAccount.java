class SavingsAccount extends BankAccount{
   double money;
   float dep;
   double with;
   
   SavingsAccount(){
      this.money = 0.00; //no argument constructor to initialize money, allows saving of values BRAH
   }
   SavingsAccount(double with){
      this.with = with; //withdraw constructor
   }
   
   SavingsAccount(float dep){
      this.dep = dep; //deposit constructor
   }

   @Override
   void deposit(){
      System.out.printf("\nYou have deposited: Php %.2f", dep);
      money += dep; //this here is to add for deposit, wahoo?
      System.out.printf("\nCurrent Savings Account Amount: Php %.2f", money);
      System.out.println("");
   }
   
   @Override
   void withdraw(){
      System.out.printf("\nYou have withdrawn: Php %.2f", with);
      System.out.println("");
      if(with > money){
         System.out.println("Money too low. Self-destruct sequence activated. Public execution tomorrow!"); //statement if amount withdraw is greater than your current balance, message deliberately placed there.
         System.out.println("");
      }else{
         money -= with; //withdraw formula.
         System.out.printf("\nCurrent Savings Account Amount: Php %.2f", money);
         System.out.println("");
      }
   }
   
   public String toString(){
      return ("Available Saving Account Balance: Php " + money); //views balance on each account, like some sort of ui?
   }
}
