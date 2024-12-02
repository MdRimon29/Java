public class Prime_numbers {
    public static void main(String[] args) {
          int n=45, i, x;
          System.out.println ("The prime numbers between 1 to 50: ");
          for (x=1;x<=n;x++)
          {
              int c = 0;
              if (x==1 || x==0)
                  continue;
              for (i=1;i<=x;i++)
              {
                  if (x%i==0)
                      c++;
              }
              if (c==2)
                  System.out.println (x);
          }
      }
  }