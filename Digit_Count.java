public class Digit_Count {

    public static void main(String[] args) {
        long n= 12345678;
        int count=0;
        do {
        n /= 10;
        count++;
        }
        while (n != 0);
        System.out.println("total: " +count);
    }
}