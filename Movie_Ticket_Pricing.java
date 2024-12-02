/*
Calculate the price of a movie ticket based on the customer's age and whether it's a weekend. 
The pricing is as follows:

Children (under 13 years): Rs. 100 on weekdays, Rs. 120 on weekends.
Adults (13 to 64 years): Rs. 150 on weekdays, Rs. 180 on weekends.
Seniors (65 years and above): Rs. 130 on weekdays, Rs. 150 on weekends.
*/

public class Movie_Ticket_Pricing {
    public static void main(String[] args) {
        int age = 30; // Customer's age
        boolean isWeekend = false; // Is it a weekend?

        if (age  <  13) {
            if (isWeekend) {
                System.out.println("Ticket Price: Rs. 120");
            } else {
                System.out.println("Ticket Price: Rs. 100");
            }
        } 
        else if (age  <= 64) {
            if (isWeekend) {
                System.out.println("Ticket Price: Rs. 180");
            } else {
                System.out.println("Ticket Price: Rs. 150");
            }
        } 
        else {
            if (isWeekend) {
                System.out.println("Ticket Price: Rs. 150");
            } else {
                System.out.println("Ticket Price: Rs. 130");
            }
        }
    }
}