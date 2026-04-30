import java.util.*;

public class InheritanceDih {

   public static void main(String [] args){
      /*Animal a1 = new Animal();
      a1.sound(); */
      Dog d1 = new Dog();
      
      System.out.println("Dog");
      d1.sound();
      System.out.println("Animal Type: " + d1.type);
      
      System.out.println();
      
      Cat c1 = new Cat();
      c1.sound();
      System.out.println("Animal Type: " + c1.type);
   }
   
}