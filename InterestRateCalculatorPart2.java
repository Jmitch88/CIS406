// Jeremy Mitchell
// CIS 461
// Week 10
// Interest Rate Calculator Part 2

package interestRateCalculatorPart2;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Currency;
import java.util.Locale;
import java.text.NumberFormat;

public class InterestRateCalculatorPart2 
{
	static double calcInterest(double loan, double rate)
	{
		return loan * rate/100.0;
	}
	static double getNumericData(Scanner input, String prompt)
	{
		double newNumeric = 0;
		boolean validInput = false;
		
		while (!validInput)
		{
			validInput = true;
			try
			{
				System.out.print(prompt);
				String inputString = input.nextLine();
				if (inputString.contains(","))
				{
					throw new InputMismatchException("");
				}
				newNumeric = Double.parseDouble(inputString);
			}
			catch (Exception e)
			{
				System.out.println("Error! Invalid numeric value. Try again");
				validInput = false;
			}
		}
		return newNumeric;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Interest Calculator");
		
		Scanner input = new Scanner(System.in);
		
		Locale usa = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
		
		char keepGoing = 'y';
		
		while (keepGoing != 'n' && keepGoing != 'N')
		{
			double loanAmount = getNumericData(input, "\nEnter loan amount: ");
			
			double interestRate = getNumericData(input, "\nEnter interest rate: ");
			
			double interestAmount = calcInterest(loanAmount, interestRate);
			
			System.out.println("\nLoan amount:\t\t" + dollarFormat.format(loanAmount));
			if ((double)((int) interestRate) == interestRate)
			{
				System.out.println("Interest rate:\t\t" + (int)interestRate + "%");
			}
			else
			{
				System.out.println("Interest rate:\t\t" + interestRate + "%");
			}
			System.out.println("Interest:\t\t" + dollarFormat.format(interestAmount));
			
			System.out.print("Continue? (y/n): ");
			keepGoing = input.next().charAt(0);
			String ignore = input.nextLine();
		}
		input.close();
		System.out.println("\nBye!!");
		
	}

}
