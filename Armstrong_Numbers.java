//check Armstrong Number for 3 digit number

import java.util.Scanner;
public class Armstrong_Numbers {
    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;
        System.out.println("Enter a number to check armstrong: ");
        Scanner input = new Scanner(System.in);
        number= input.nextInt();
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}