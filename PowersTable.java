package powersTable;
import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		
		System.out.println("Welcome to the Square and Cubes table");
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
			int num = sc.nextInt();
			System.out.println();
			System.out.println("Number  Squared  Cubed");
			System.out.println("======  =======  =====");
			
			for (int i = 1; i <= num; i++) {
				int square = i * i;
				int cube = i * i * i;
				
				System.out.printf("%-8d %-9d %-5d%n", i, square, cube);
				
			}
			System.out.println();
			System.out.print("Continue? (y/n): ");
			cont = sc.next();
			System.out.println();
		}
		System.out.println("Bye!!");
		sc.close();
	}

}
