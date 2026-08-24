// Jeremy Mitchell
// CIS 406
// Week 8 Tip Calculator

package tipCalculator;

import java.util.Scanner;
import java.text.NumberFormat;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(0);
		
		String cont = "y";
		
		System.out.println("Tip Calculator\n");
		
		while (!cont.equalsIgnoreCase("n")) {
			System.out.print("Cost of meal: ");
			double mealCost = sc.nextDouble();
			
			System.out.println();
			
			for(double tipRate = 0.15; tipRate <= 0.25; tipRate += 0.05) {
				double tipAmount = mealCost * tipRate;
				double totalAmount = mealCost + tipAmount;
				
				System.out.println(percent.format(tipRate));
				System.out.println("Tip amount: " + "\t" + money.format(tipAmount));
				System.out.println("Total amount: " + "\t" + money.format(totalAmount));
				
			}
			System.out.print("Continue? (y/n): ");
			cont = sc.next();
			System.out.println();
		}
		System.out.println("Bye!!!");
		sc.close();
	}

}
