package Homework7;
import java.util.Scanner;

public class FutureInvestmentVal {

	public static void main(String[] args) {
		//declarations
		Scanner s = new Scanner(System.in);
		//accepting user input
		System.out.println("Enter an investment amount");
		double investAmt = s.nextDouble();
		System.out.println("Enter an interest rate");
		double rate = s.nextDouble();
		System.out.println("For how many years?");
		int years = s.nextInt();
		//calling method
		futureInvestmentValue(investAmt, rate, years);
	}
	//method handling compounding interest
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double cash = investmentAmount;
		double prevYear = investmentAmount;
		double realRate = monthlyInterestRate * .01;
		
		System.out.println("The amount invested: " + investmentAmount);
		System.out.println("Annual interest rate: " + monthlyInterestRate + "%");
		System.out.println("Years \t Future Value");
		//for loop compounding interest
		for (int i = 1; i <= years; i++) {
			cash += prevYear * (realRate);
			prevYear = cash;
			System.out.print(i);
			System.out.println("\t\t" + cash);
		
		}
		
		return cash;
	}

}
