// Jeremy Mitchell
// CIS 406
// Interest Rate Calculator Part 1

package interestRateCalculatorPart1;

import java.util.Scanner;
import java.text.NumberFormat;

public class InterestRateCalculatorPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(1);
		
		System.out.println("Welcome to the Interest Calculator");
		
		String choice = "y";
		
		while (!choice.equalsIgnoreCase("n")) {
			
			System.out.print("Enter loan amount: \t");
			double loanAmount = sc.nextDouble();
			
			System.out.print("Enter interest rate: \t");;
			double rateWhole = sc.nextDouble();
			double rateDecimal = rateWhole / 100;
			
			double interestAmount = calculateInterest(loanAmount, rateDecimal);
			
			System.out.println();
			System.out.println("Loan amount: " + "\t" + "\t" + currency.format(loanAmount));
			System.out.println("Interest rate: " + "\t" + "\t" + rateWhole + "%");
			System.out.println("Interest: " + "\t" + "\t" + currency.format(interestAmount));
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			
			
		}
		
		System.out.println("Bye!!!");
		sc.close();
		
	}

	public static double calculateInterest(double loanAmount, double rate) {
		return loanAmount * rate;
	}
}
