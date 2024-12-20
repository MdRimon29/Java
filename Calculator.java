//Simple Calculator using Java switch Statement

import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {

    char operator;
    double number1, number2, result;

    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, / or %");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      
      case '%':
        result =  number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}