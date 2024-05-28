package Exam;

public class FinalExamDemo {//Feby Akliji Rofiah - A11.2022.14529
    public static void main(String[] args) {    

       // Testing FinalExam
       FinalExam finalExam = new FinalExam(50, 5);
       System.out.println("--Final Exam--");
       System.out.println("Points per Question: " + finalExam.getPointsPerQuestion());
       System.out.println("Number of Questions Missed: " + finalExam.getNumberMissed());      
       System.out.println("Score: " + finalExam.getScore());   
       System.out.println("Grade: " + finalExam.getGrade());   
      
       // Testing PassFailExam       
       PassFailExam passFailExam = new PassFailExam(50, 3, 60);
       System.out.println("--Pass/Fail Exam--");
       System.out.println("Points per Question: " + passFailExam.getPointsEach());
       System.out.println("Number of Questions Missed: " + passFailExam.getNumMissed());      
       System.out.println("Score: " + passFailExam.getScore());   
       System.out.println("Grade: " + passFailExam.getGrade());   
      
    }
}



