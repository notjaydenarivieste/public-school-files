class Motorcycle extends Vehicle{
   
   Motorcycle(String brand){
      super(brand);
   }

   @Override
   void start(){
      System.out.println("Motorcycle is starting with a button.");
   }
}