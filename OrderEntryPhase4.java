// Jeremy Mitchell
// CIS 406
// Order Entry Course Project Phase 4

package orderEntryPhase4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OrderEntryPhase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_ITEMS = 10;
		String[] itemNumber = new String[MAX_ITEMS];
		String[] itemDescription = new String[MAX_ITEMS];
		double[] itemPrice = new double[MAX_ITEMS];
		int[] quantityOrdered = new int[MAX_ITEMS];
		double[] grossAmount = new double[MAX_ITEMS];
		double[] taxPercentage = new double[MAX_ITEMS];
		double[] taxAmount = new double[MAX_ITEMS];
		double[] discountPercent = new double[MAX_ITEMS];
		double[] discountAmount = new double[MAX_ITEMS];
		double[] netAmount = new double[MAX_ITEMS];
		
		String response = "?";
		char moreItems = 'y';
		int itemCount = 0;
		double totalGrossAmount = 0;
		double totalTaxAmount = 0;
		double totalDiscountAmount = 0;
		double totalNetAmount = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Invoice Date (MM/DD/YYYY): ");
		String invoiceDate = input.nextLine();
		System.out.print("Enter Customer Name: ");
		String customerName = input.nextLine();
		System.out.print("Enter Customer Street Address: ");
		String streetAddress = input.nextLine();
		System.out.print("Enter Customer City: ");
		String customerCity = input.nextLine();
		System.out.print("Enter Customer State (2 char): ");
		String customerState = input.nextLine();
		System.out.print("Enter Zip Code (5 digits): ");
		String zipCode = input.nextLine();
		System.out.println();
		
		while (moreItems != 'n' && moreItems != 'N')
		{
			try
			{
				System.out.print("Enter Item Number: ");
				itemNumber[itemCount] = input.nextLine();
				System.out.print("Enter Item Description: ");
				itemDescription[itemCount] = input.nextLine();
				System.out.print("Enter Item Price: ");
				itemPrice[itemCount] = input.nextDouble();
				System.out.print("Enter Quantity Ordered: ");
				quantityOrdered[itemCount] = input.nextInt();
				System.out.print("Enter Tax Percentage: ");
				taxPercentage[itemCount] = input.nextDouble();
				System.out.print("Enter Discount Percent: ");
				discountPercent[itemCount] = input.nextDouble();
				
				
			}
			catch (InputMismatchException e)
			{
				System.out.println("Input format error!");
				e.printStackTrace();
			}
			
			grossAmount[itemCount] = itemPrice[itemCount] * quantityOrdered[itemCount];
			taxAmount[itemCount] = grossAmount[itemCount] * taxPercentage[itemCount] / 100;
			discountAmount[itemCount] = (grossAmount[itemCount] + taxAmount[itemCount]) * discountPercent[itemCount] / 100;
			netAmount[itemCount] = grossAmount[itemCount] + taxAmount[itemCount] - discountAmount[itemCount];
			
			totalGrossAmount += grossAmount[itemCount];
			totalTaxAmount += taxAmount[itemCount];
			totalDiscountAmount += discountAmount[itemCount];
			totalNetAmount += netAmount[itemCount];
			itemCount++;
			
			System.out.print("\nMore items? (y/n): ");
			moreItems = input.next().charAt(0);
			response = input.nextLine();
			
		}
		input.close();
		
		System.out.println();
		System.out.println("Invoice Date: " + invoiceDate + "\n");
		System.out.println("Customer Name\t\t" +
							"Customer Street\t\t\t" +
							"Customer City\t\t" +
							"Customer State\t\t" +
							"Customer Zip Code");
		System.out.println("---------------\t\t" +
							"---------------\t\t" +
							"-------------\t\t" +
							"--------------\t\t" +
							"-------------------\t\t");
		System.out.println(customerName + "\t\t" +
							streetAddress + "\t" +
							customerCity + "\t\t\t" +
							customerState + "\t\t\t" +
							zipCode + "\t\t\n");
		
		System.out.println("Item Number\t" +
							"Item Description\t" +
							"Item Price\t" +
							"Quantity\t" +
							"Gross Amt\t" +
							"Tax %\t" +
							"Tax Amt\t" +
							"Discount %\t" +
							"Discount Amt\t" +
							"Net Amt");
		System.out.println("-----------\t" +
							"---------------\t" +
							"----------\t" +
							"--------\t" +
							"---------\t" +
							"------\t" +
							"--------\t" +
							"-----------\t" +
							"-------------\t" +
							"-------");
		for (int i = 0; i < itemCount; i++)
		{
			System.out.println(itemNumber[i] + "\t\t" +
								itemDescription[i] + "\t\t" +
								"$" + itemPrice[i] + "\t\t" +
								quantityOrdered[i] + "\t\t" +
								grossAmount[i] + "\t\t" +
								taxPercentage[i] + "\t" +
								"$" + taxAmount[i] + "\t" +
								discountPercent[i] + "\t\t" +
								"$" + discountAmount[i] + "\t\t" +
								"$" + netAmount[i]);
		}
		System.out.println("\nTotals\t\t" +
							"# items = " + itemCount + "\t\t" +
							"\t\t" +
							"\t" +
							"\t" + totalGrossAmount + "\t\t" +
							"\t" +
							"$" + totalTaxAmount + "\t" +
							"\t\t" +
							"$" + totalDiscountAmount + "\t\t" +
							"$" + totalNetAmount);
	}

}
