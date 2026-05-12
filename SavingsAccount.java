class SavingsAccount extends BankAccount{
   double money;
   float dep;
   double with;
   
   SavingsAccount(){
      this.money = 0.00;
   }
   SavingsAccount(double with){
      this.with = with;
   }
   
   SavingsAccount(float dep){
      this.dep = dep;
   }

   @Override
   void deposit(){
      System.out.printf("\nYou have deposited: Php %.2f", dep);
      money += dep;
      System.out.printf("\nCurrent Savings Account Amount: Php %.2f", money);
      System.out.println("");
   }
   
   @Override
   void withdraw(){
      System.out.printf("\nYou have withdrawn: Php %.2f", with);
      System.out.println("");
      if(with > money){
         System.out.println("Money too low. Self-destruct sequence activated. Public execution tomorrow!");
         System.out.println("");
      }else{
         money -= with;
         System.out.printf("\nCurrent Savings Account Amount: Php %.2f", money);
         System.out.println("");
      }
   }
   
   public String toString(){
      return ("Available Saving Account Balance: Php " + money);
   }
}