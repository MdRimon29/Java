class Calculation {

    // Method 1: Multiplication of 2 numbers
    static int Multiply(int a, int b)
    {
        return a * b;
    }
    // Method 2 : Multiplication of 3 numbers
    static int Multiply(int a, int b, int c)
    {

        // Return product
        return a * b * c;
    }
}
// Main class
class Method_overloading {
    public static void main(String[] args)
    {
        Calculation obj= new Calculation();   
        System.out.println(obj.Multiply(3256, 764));
        System.out.println(obj.Multiply(223, 731, 356));
    }
}