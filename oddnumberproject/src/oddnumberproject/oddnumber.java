package oddnumberproject;

import java.util.Scanner;

public class oddnumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int odd_number=100;
		int odd;

		while(true) {
			System.out.print("guess an odd number between 1 - 30:");
			odd= scanner.nextInt();
			
			if(odd==odd_number) {
				System.out.println("Congratulations!you guessed it.");
				break;
			}else if (odd<odd_number) {
				System.out.println("guess an odd number less than 20");
				break;
			}else {
				System.out.println("Too high. Try again");
			}
		}

	}

	}
