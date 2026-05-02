import java.util.*;

public class VehicularInheritance{
   
/*DUDEEEEEEEEEEE, IF YOU ARE READING THIS, MAKE SURE YOU HAVE DOWNLOADED
THE VEHICLE, CAR, AND MOTORCYCLE JAVA FILES OR TS WILL NOT WORK!!!!!!!!!!*/
   
   public static void main(String [] args){
      //user input modification, for funsies.
   
      Scanner nuzi = new Scanner(System.in);
      
      System.out.print("Input Car Brand: ");
      String x = nuzi.nextLine();
      Car car1 = new Car(x);
      
      car1.start();
      
      System.out.println("");
      
      System.out.print("Input Motorcycle Brand: ");
      String y = nuzi.nextLine();
      Motorcycle moto1 = new Motorcycle(y);
      
      moto1.start();
      
      /*for no user-input modification, just remove the ones that would need an input
      so uhh, yeah, if you decide to do that, please add a brand inside the parenthesis
      of the constructor in this file, pleaseeeeeee
      
      like, instead of Motorcycle(x), do Motorcycle("Yamaha")... thank you!!!!

      and do the same to the other files, instead of Car(brand) just do Car("Mercedes").
      
      -J*/
   }
}
