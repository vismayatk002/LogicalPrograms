package logicalPrograms;

import java.util.Scanner;

public class ReverseOfNumber {
	
	public static void reverse(int number) {
		
	int reverseNumber = 0;	
	while(number != 0) {
		
		int remainder = number % 10;
		reverseNumber = reverseNumber * 10 + remainder;
		number = number / 10 ; 
	}
	System.out.print("Reverse of number : " + reverseNumber);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		reverse(number);
		sc.close();
	}
}
