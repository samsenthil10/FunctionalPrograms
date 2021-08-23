package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class SumOfThreeNumbersIsZero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of Numbers:");
		int numberOfNumbers = scanner.nextInt();
		int[] numbers = new int[numberOfNumbers];

		System.out.println("Please enter the numbers:");
		for(int index=0; index<numberOfNumbers; index++) {
			numbers[index] = scanner.nextInt();
		}
		scanner.close();

		System.out.println("The triplets are:");
		for(int index=0; index < numberOfNumbers ; index++) {
			int sum=0;
			for(int jIndex=index+1;jIndex<numberOfNumbers; jIndex++) {
				for(int kIndex=jIndex+1; kIndex<numberOfNumbers; kIndex++) {
					sum=numbers[index] + numbers[jIndex] + numbers[kIndex];
					if(sum == 0) {
						System.out.println(numbers[index]+", "+numbers[jIndex]+", "+numbers[kIndex]);
					}
				}
			}
		}
	}
}