package com.bridgelabz.functionalprograms;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArrays {

	public static void printTwoDimensionalArray(int [][] twoDimensionalArray) {
		PrintWriter printWriter = new PrintWriter(System.out);

		for(int rowIndex=0; rowIndex < twoDimensionalArray.length; rowIndex++) {
			for(int columnIndex=0; columnIndex < twoDimensionalArray[0].length; columnIndex++) {
				printWriter.append(twoDimensionalArray[rowIndex][columnIndex]+" ");
			}
			printWriter.append("\n");
		}
		printWriter.flush();
		printWriter.close();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of Rows: ");
		int mNumberOfRows = scanner.nextInt();
		System.out.print("Number of Columns:");
		int nNumberOfColumns = scanner.nextInt();
		int[][] twoDimensionalArray = new int[mNumberOfRows][nNumberOfColumns];
		System.out.print("Enter contents of array: ");

		for(int rowIndex=0; rowIndex < mNumberOfRows; rowIndex++) {
			for(int columnIndex=0; columnIndex < nNumberOfColumns; columnIndex++) {
				twoDimensionalArray[rowIndex][columnIndex] = scanner.nextInt();
			}
		}
		System.out.println();
		printTwoDimensionalArray(twoDimensionalArray);
		scanner.close();
	}
}