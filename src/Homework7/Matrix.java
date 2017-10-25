package Homework7;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		//declarations and accepting user input
		Scanner s = new Scanner(System.in);
		System.out.println("Choose a matrix size");
		int size = s.nextInt();
		printMatrix(size);

	}
	//method for matrix
	public static void printMatrix(int n) {
		//nested loop printing matrix
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				double random = Math.random() * 10;
				
				if (random >= 5) {
					random = 0;
				} else {
					random = 1;
				}
				System.out.print((int)random);
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
