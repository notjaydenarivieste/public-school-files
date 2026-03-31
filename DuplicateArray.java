import java.util.*;

public class DuplicateArray{
   public static void main(String [] args){
      int num[] = {312, 27, 27, 124, 12, 12, 12, 50, 312, 45, 312};
      boolean[] checker = new boolean[num.length]; 
      
      System.out.print("Duplicate Elements: ");
      for(int i = 0; i < num.length; i++){
         if(checker[i]) //checks if the element is already compared for being a duplicate
            continue; //skips everything down below and goes back to the top of the loop... like... duh?
            
         boolean duplicate = false; // dont overthink this, this is just a decision value if the number should be printed or not
         for(int j = i + 1; j < num.length; j++){
            if(num[i] == num[j]) {
               duplicate = checker[j] = true; //simply turns the "duplicate" value from false to true, thus allowing to print the value
               //checker[j] ensures that duplicated value is printed ONLY ONCE. if you havee five "5's" then only one "5" will be printed
               
               
               /*
               shoter version for...
               
               duplicate = true
               checker[j] = true
               */
            }
         }  
         
         if(duplicate){ //connected to the "boolean duplicate" thing, if true, then print, if false, then skips...
            System.out.print(num[i]+" ");
         }
      }
   }
}