import java.util.Scanner;
class Pretersen_Number {
  public static void main(String[] args) {
        int num, output; 
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter an integer number: ");
        num = input.nextInt();
        output= petersen(num);
        if (num == output)
             System.out.println (num + " is a petersen number");
        else 
            System.out.println (num + " is not a petersen number");
    }
    public static int factorial (int r)
    { 
        int fact = 1;
        for (int i =1; i<=r;i++)
            fact = fact *i;
        System.out.println ("Factorial of " + r + " is: " + fact);
        return fact;
    }
    public static int petersen (int n)
    {
        int result=0, rem;
        while(n>0)
        {
            rem = n%10;
            result += factorial(rem);
            System.out.println("Summation: " +result);
            n/=10;      
        }
        return result;
    }
}