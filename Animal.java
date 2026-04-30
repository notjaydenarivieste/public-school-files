class Animal{

   String type = "Mammal";
   
   Animal(){
      System.out.println("1st Constructor!"); 
   }
   
   Animal(String type){
      System.out.println("2nd Constructor!"); 
   }
   
   
   void sound(){
      System.out.println("Animal Sound!");
   }
}