import java.util.Scanner;
public class IT24100659Lab4Q2{
   public static void main(String[] args){
      int examMarks,labMarks,percentageExam,percentageLab, sumOfPercentage;
      double finalMark;
      Scanner input= new Scanner(System.in);
      System.out.println("Please enter exam marks(out of 100) :");
       examMarks=input.nextInt();
     if(examMarks >= 0 || examMarks<=100)
      {
       System.out.println("Please enter lab submission marks (out of 100) :");
       labMarks=input.nextInt();
     
     if(labMarks>=0 && labMarks<=100)
     {
       System.out.println("Please enter given for the exam :");
        percentageExam=input.nextInt();

       System.out.println("Please enter given for the lab submission :");
        percentageLab=input.nextInt();
    
          sumOfPercentage =percentageExam+ percentageLab;
          if(sumOfPercentage ==100){
          
          finalMark=(examMarks*percentageExam/100) + (labMarks*percentageLab/100);
           System.out.println("Final Exam Mark is : " +finalMark);
           }
      else{
      System.out.println("The percentages must add up to 100. Terminating program. ");
      }
    }
      else{
       System.out.println("Invalid input for exam marks. Terminating program. ");
      }
    }
 }
}


