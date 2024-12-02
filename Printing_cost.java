/*Printing cost
Create a printing application program where we will take 
the number of copies to be printed as input from the user 
and then prints the price per copy and the total price for the printing copies.

The chart price to print the number of copies is given below:

 0 – 99 : $0.30 per copy
100 – 499 :  $0.28 per copy
500 – 799 : $0.27 per copy
800 – 1000 : $0.26 per copy
over 1000 : $0.25 per copy
*/

import java.util.Scanner;
public class Printing_cost {
public static void main(String[] args) 
{ 	
// Create an object of Scanner class to take the input.
  Scanner sc = new Scanner(System.in);
 
  System.out.println("Enter the number of copies to be printed:");
  int noOfCopies = sc.nextInt();

  if(noOfCopies > 0 && noOfCopies < 100) {
     double pricePerCopies = 0.30;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else if(noOfCopies >= 100 && noOfCopies < 500) {
     double pricePerCopies = 0.28;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else if(noOfCopies >= 500 && noOfCopies < 800) {
     double pricePerCopies = 0.27;
     System.out.println("Price per copy: " +"$"+pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else if(noOfCopies >= 800 && noOfCopies < 1000) {
     double pricePerCopies = 0.26;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is "+"$" +totalCost);
  }
  else {
     double pricePerCopies = 0.25;
     System.out.println("Price per copy: "+"$" +pricePerCopies);
     double totalCost = noOfCopies * pricePerCopies;
     System.out.println("Total cost is " +"$"+totalCost); 	
  }
 }
}