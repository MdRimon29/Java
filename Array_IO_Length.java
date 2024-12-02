import java.util.Scanner;
class Array_IO_Length {
  public static void main(String[] args) {
      int[] list = new int[5];
      int len = list.length;
      System.out.println ("The size of array: " + len);
      Scanner input = new Scanner(System.in);
      System.out.println ("Insert the elements of array: ");
      for (int i =0; i< list.length; i++)
          list[i]= input.nextInt();
      System.out.println ("The elements of array: ");
      for (int i =0; i< list.length; i++)
          System.out.println (list[i] + "  ");
  }
}