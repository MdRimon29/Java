import java.util.Scanner;

public class ATM_Transaction	//File name = Public class name is required because the compiler and runtime environment depend on it.
{
	public static void main(String[] args) {
	    
	    int balance=250000;
	    Scanner input=new Scanner(System.in);
	    while(true)
	    {
	        System.out.println("Welcome to the home page of ATM Booth");
	        System.out.println("Please choose an option from these options:");
    	    System.out.println("1. Withdraw");
    	    System.out.println("2. Deposit");
    	    System.out.println("3. Check Balance");
    	    System.out.println("4. Exit");
    	    int perform=input.nextInt();
    	    
    	    switch(perform)
    	    {
    	        case 1:
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
    	            break;
    	        }
    	        case 2:
    	        {
    	            System.out.println("How much amount you want to Deposit?");
    	            int deposit=input.nextInt();
    	            balance=balance + deposit;
    	            System.out.println("Deposit transaction has been successful.");
    	            break;
    	        }
    	        case 3:
    	        {
    	            System.out.println("Your current balance is : "+ balance);
    	            break;
    	        }
    	        case 4:
    	        {
    	            System.out.println("This is our home page");
    	            System.exit(0);
    	            break;
    	        }
	        }
	    }
	}
}