public class Student{
   String name;
   int grade;


   Student(String name, int grade){
      this.name = name;
      this.grade = grade;
   }

   boolean hasPassed(){
      return grade >= 50;
   }
   
   //oh boy, this one was the easiest part.
}