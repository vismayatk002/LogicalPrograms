package logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void fibonacci(int N) {
		
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		if(N > 0) {
		while(count < N) {
			
			System.out.print(num1 + " " );
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		count++;	
		}
		}
		else {
			System.out.println("Invalid Input " );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number of Fibonacci numbers : ");
		int N = sc.nextInt();
		System.out.print("Fibonacci numbers : ");
		fibonacci(N);
		sc.close();
	}

}
