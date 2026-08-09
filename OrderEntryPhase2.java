package orderEntryPhase2;

import java.util.Scanner;

public class OrderEntryPhase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter item number: ");
		String itemNumber = input.nextLine();
		
		System.out.print("Enter item description: ");
		String itemDescription = input.nextLine();
		
		System.out.print("Enter item price: ");
		double itemPrice = input.nextDouble();
		
		System.out.print("Enter quantity ordered: ");
		int quantity = input.nextInt();
		
		double grossAmount = itemPrice * quantity;
		
		System.out.print("Enter tax percent: ");
		double taxPercent = input.nextDouble();
		
		double taxAmount = grossAmount * (taxPercent / 100);
		
		System.out.print("Enter discount percent: ");
		double discountPercent = input.nextDouble();
		
		double discountAmount = grossAmount * (discountPercent / 100);
		
		double netAmount = grossAmount + taxAmount - discountAmount;
		
		System.out.println("\nITEM INFORMATION");
		System.out.println("Item Number\tDescription\tPrice\tQuantity\tTax %\t Tax Amount\tDiscount Amount\tNet Amount");
		System.out.printf("%s\t%s\t%.2f\t%d\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", 
				itemNumber, itemDescription, itemPrice, quantity, 
				taxPercent, taxAmount, discountPercent, discountAmount, netAmount); 
		
		input.close();
	}

}
