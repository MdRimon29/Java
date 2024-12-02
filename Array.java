import java.util.Scanner;
class Array {
  public static void main(String[] args) {
      int[] list = new int[5];
      int i, sum =0;
      int len = list.length;
      Scanner input = new Scanner(System.in);
      System.out.println ("Insert the elements of array: ");
      for (i =0; i< list.length; i++)
          list[i]= input.nextInt(); 
  
      for (i =0; i< list.length; i++)
          sum = sum + list[i]; 
      double average = (double) sum / len;
      System.out.println ("Sum: " + sum);
      System.out.println ("Average: " + average);
      int large = list[0];
      for (i=1; i<list.length; i++)
      {
          if (large<list[i])
              large = list[i];
      }
      System.out.println ("Large: " + large);
  }
}