package Homework7;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		//declarations and receiving boundaries
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a lower and upper boundary");
		int lower = s.nextInt();
		int upper = s.nextInt();
		printPrimes(lower, upper);
	}
	//method for primes
	public static void printPrimes(int lower, int upper) {
		//initial checkers
		if (upper < lower) {
			System.out.println("Invalid Range of Numbers");
		}
		if (upper < 0 || lower < 0) {
			System.out.println("Invalid Input");
		}
		//declarations of a prime counter and a string to store primes in
		int count = 0;
		String s = "";
		//for loops running through range and checking to see if numbers are prime
		for (int i = lower; i <= upper; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				//if number is prime counter set to 2
				if ( i % j == 0) {
					counter += 1;
				}
			}
			//if prime add number to string and increment count
			if (counter == 2) {
				s += i+ " ";
				count++;
			}
		}
		//final prints
		if (count == 0) {
			System.out.println("There are no prime numbers in this range");
		} else {
			System.out.println("The prime numbers in this range are " + s);
		}
		
	}
}


