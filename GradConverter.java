package gradeConverter;

import java.util.Scanner;

public class GradConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to the Letter Grade Converter");
			
			String choice = "y";
			
			while (choice.equalsIgnoreCase("y")) {
				System.out.print("Enter numerical grade: ");
				int numericGrade = sc.nextInt();
				
				String letterGrade;
				if (numericGrade >= 90 && numericGrade <= 100) {
					letterGrade = "A";
				} else if (numericGrade >= 80 && numericGrade <= 89) {
					letterGrade = "B";
				} else if (numericGrade >= 70 && numericGrade <= 79) {
					letterGrade = "C";				
				} else if (numericGrade >= 60 && numericGrade <= 69) {
					letterGrade = "D";
				} else {
					letterGrade = "F";
				}
				
				System.out.println("Letter grade: " + letterGrade);
				System.out.print("Continue? (y/n): ");
				choice = sc.next();
			}
			System.out.println("Bye!!");
			sc.close();
	}

}
