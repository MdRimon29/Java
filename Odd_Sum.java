class Odd_Sum{
    public static void main(String[] args) {
          int i,sum=0;
          System.out.println ("The odd numbers between 1 to 100, divisible by 7 are: ");
          for (i=1; i<=100; i++)
          {
              if (i%2!=0 && i%7==0)
                  System.out.println (i);
              sum= sum+i;
          }
          System.out.println("total: " +sum);
      }
  }