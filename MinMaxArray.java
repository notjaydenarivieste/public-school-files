import java.util.*;

public class MinMaxArray{
   public static void main(String [] args){
      int num[] = {32, 54, 22, 1, 20};
   	
      /*default values are the 0th index, gets replaced when certain conditions are met*/
      int min = num[0];
      int max = num[0];
      
   	/*compares each element and finding out which one is the lowest
      gets replaced when an element is lesser than the current "min" value */
      for (int i = 0; i < num.length; i++){
         if(min > num[i]){
            min = num[i];
         }
      }
   	
   	/*compares each element and finding out which one is the maximum
      gets replaced when an element is greater than the current "max" value */
      for (int i = 0; i < num.length; i++){
         if(max < num[i]){
            max = num[i];
         }
      }
   	
      System.out.println("Array's Minimum Value: " + min);
      System.out.println("Array's Maximum Value: " + max);
   }
}