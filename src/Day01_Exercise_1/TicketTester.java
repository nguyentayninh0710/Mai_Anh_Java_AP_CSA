package Day01_Exercise_1;
/*
Exercise 1 – MovieTicket Attributes
A cinema sells tickets with a base price and a student discount.
Write a class to store the ticket information and calculate the final price.

Specifications

Write a class called MovieTicket with the following attributes:

double basePrice – the normal price before tax and discount

double discountPercent – the discount percentage (for example, 20.0 for 20%)

boolean isStudent – true if the customer is a student, false otherwise

final double TAX_RATE = 0.08 – tax rate is 8% on the price after discount

In a separate TicketTester class, write a main method that:

Creates a MovieTicket object for a student:

basePrice = 12.50

discountPercent = 20.0

isStudent = true

Calculates the final price as follows (you may use local variables or methods):

Discounted price = basePrice - (basePrice * discountPercent / 100)

Final price = discounted price + (discounted price * TAX_RATE)

Prints the final price with a clear message, for example:
Final ticket price: 10.80 
 */
public class TicketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicket ticket = new MovieTicket();
		ticket.basePrice = 12.50;
		ticket.discountPercent = 20.0;
		ticket.isStudent = true;
		
		double discountPrice = ticket.basePrice - (ticket.basePrice *  ticket.discountPercent/ 100.0);
		double finalPrice = discountPrice + (discountPrice * ticket.TAX_RATE);
		
		System.out.println("Final ticket price: " +  finalPrice);
	}

}
