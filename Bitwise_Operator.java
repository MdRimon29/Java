public class Bitwise_Operator {
    public static void main(String[] args) {
          byte a=5, b=9;
          System.out.println ("Bitwise AND: " + (a&b));
          System.out.println ("Bitwise OR: " + (a|b));
          System.out.println ("Bitwise XOR: " + (a^b));
          System.out.println ("Left Shift A by 1: " + (a<<1));
          System.out.println ("Right Shift B by 1: " + (b>>1));
          System.out.println ("Complement of A: " + ~a);
    }
  }