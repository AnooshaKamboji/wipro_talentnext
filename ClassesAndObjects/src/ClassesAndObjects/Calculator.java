package ClassesAndObjects;

import java.util.Scanner;

public class Calculator {
	static int PowerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

	static double PowerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = Calculator.PowerInt(n, m);
		double result2 = Calculator.PowerDouble(n, m);
		System.out.println(result);
		System.out.println(result2);

	}

}