package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
	
	//return sum of factors
	public static int getSumFactors(int number) {
		
		int sum = 0;
		if(number > 1){
			for(int i=1; i<=number/2; i++) {
				
				if(number % i == 0){
					 sum = sum + i;  
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int sumFactor = getSumFactors(number);
		if(sumFactor == number ){
			System.out.print("Perfect Number");
		}
		else {
			System.out.print("Not a Perfect Number");
		}
		sc.close();
	}
}
