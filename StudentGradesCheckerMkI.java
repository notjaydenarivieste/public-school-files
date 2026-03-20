import java.util.*;

public class StudentGradesCheckerMkI {
   public static void main (String [] args){
      Scanner sc = new Scanner (System.in);
      
      int size; //remove 5 to turn size into an empty data thing, just for fun... :3
      
      
      
      System.out.print("Enter number of students: ");
      size = sc.nextInt();
      System.out.println("");
      sc.nextLine();
      
      
      
      //turn the comment above into ACTUAL code so that the amount of students can be inputted by the user, because I HAVE CHOSEN TO SUFFER AND DO USER INPUT
      
      Student[] studentListing = new Student[size];
      
      for (int j = 0; j < size; j++){
         System.out.print("Enter student " + (j+1) + " name: ");
         String name = sc.nextLine();
         System.out.print("Enter student " + (j+1) + " grade: ");
         int grade = sc.nextInt();
         System.out.println("");
         sc.nextLine();
         
         studentListing[j] = new Student(name, grade);
         
      }
      
      for(int i = 0; i < size; i++){
         if(studentListing[i].hasPassed()){
            System.out.print(studentListing[i].name + " has PASSED with the grade of " + studentListing[i].grade);
            System.out.println("");
         }else{
            System.out.print(studentListing[i].name + " has FAILED with the grade of " + studentListing[i].grade);
            System.out.println("");
         }
      }
      
      //this code made me very angy >:(
   }
}