package logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void isPrime(int N) {
		
		int flag = 1;
		if(N > 1){
			for(int i=2; i<N; i++) {
			
				if(N % i == 0){
					System.out.println("Not a Prime Number");
					flag = 0;
					break;
				}
			}
		}
		if(flag == 1){
			System.out.println("Prime Number");
		}
	}
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter a number : ");
			int N = sc.nextInt();
			isPrime(N);
			sc.close();
		}
}
