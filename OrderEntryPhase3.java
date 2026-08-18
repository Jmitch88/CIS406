//Jeremy Mitchell
//CIS406 - Course Project Phase 3
// Week7 - Using a Loop to Allow Multiple Entries
package orderEntryPhase3;

import java.util.Scanner;

public class OrderEntryPhase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int totalItems = 0;
		double totalGross = 0.0;
		double totalTax = 0.0;
		double totalDiscount = 0.0;
		double totalNet = 0.0;
		
		String continueEntry = "Y";
		
		while (continueEntry.equalsIgnoreCase("Y")) {
		
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
		
			input.nextLine();
		
			System.out.println("\nITEM INFORMATION");
			System.out.printf("%-15s %-30s %-10s %-8s %-12s %-8s %-12s %-12s %-12s %-12s\n",
					 "Item Number", "Description", "Price", "Qty", "Gross Amt", "Tax %", "Tax Amt",
					 "Disc %", "Disc Amt", "Net Amt");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-15s %-30s $%-9.2f %-8d %-12.2f %-8.2f %-12.2f %-12.2f %-12.2f %-12.2f\n", 
				itemNumber, itemDescription, itemPrice, quantity, grossAmount,
				taxPercent, taxAmount, discountPercent, discountAmount, netAmount);
		
			totalItems++;
			totalGross += grossAmount;
			totalTax += taxAmount;
			totalDiscount += discountAmount;
			totalNet += netAmount;
		
			System.out.print("\nDo you want to enter another item? (Y/N): ");
			continueEntry = input.nextLine();
		
		}
		
		System.out.println("\nORDER TOTALS");
		System.out.println("----------------------");
		System.out.printf("%-15s %-30s %-12s %-12s %-12s\n",
				"Total Items", "Total Gross", "Total Tax", "Total Discount", "Total Net");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.printf("%-15d %-30.2f %12.2f %-12.2f %-12.2f\n",
				totalItems, totalGross, totalTax, totalDiscount, totalNet);
		
			input.close();
	}

}