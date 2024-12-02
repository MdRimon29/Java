/*Grade Calculator
Take input the total marks of 5 subjects and calculate 
percentage and Grade according to percentage using Java if-else-if ladder.
*/

import java.util.Scanner;
public class Grade_Calculator {
public static void main(String[] args) 
{ 	
// Create an object of Scanner class to take the input.
   Scanner sc = new Scanner(System.in);
 
   System.out.println("Enter your total marks of 5 subjects:");
   int totalMarks = sc.nextInt();
   	
   float myPer = totalMarks/5;
   System.out.println("Percentage is: " +myPer);

// Applying if-else if ladder statements.
   if (myPer >= 90.0)
      System.out.print("Grade A");
   else if (myPer >= 80.0)
      System.out.print("Grade B");
   else if (myPer >= 70.0)
      System.out.print("Grade C");
   else if (myPer >= 60.0)
      System.out.print("Grade D");
   else
      System.out.print("Grade F");
 }
}