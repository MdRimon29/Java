import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input=new Scanner(System.in);
	    System.out.println("Choose an option from these options:");
	    System.out.println("Withdraw");
	    System.out.println("Deposit");
	    System.out.println("Check Balance");
	    System.out.println("Exit");
	    String perform=input.nextLine();
	    int balance=250000;
	    
	    switch(perform)
	    {
	        case "Withdraw":
	        {
	            System.out.println("How much amount you want to withdraw?");
	            int withdraw_amount=input.nextInt();
	            if(balance>=withdraw_amount)
	            {
	                int reduce=balance - withdraw_amount;
	                System.out.println("Your withdrawn is successful.Your new amount is "+reduce);
	            }
	            else
	            {
	                System.out.println("Insufficient Funds");
	            }
	        }
	        case "Deposit":
	        {
	            System.out.println("How much amount you want to Deposit?");
	            int deposit=input.nextInt();
	            balance=balance + deposit;
	            System.out.println("Deposit transaction has been successful.");
	        }
	        case "Check Balance":
	        {
	            System.out.println("Your current balance is : "+ balance);
	        }
	        case "Exit":
	        {
	            System.out.println("This is your home page");
	        }
	    }
	    
		
	}
}