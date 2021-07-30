package logicalPrograms;

import java.util.Scanner;

public class StopWatch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Press 1 to start Stopwatch :");
		int s = sc.nextInt();
		if(s == 1) {
			long start = System.currentTimeMillis();
			System.out.print("\nPress any number to stop Stopwatch :");
			int c = sc.nextInt();
			long stop = System.currentTimeMillis();
			float timeElapsed = (stop - start) / 1000;
			System.out.printf("Elapsed Time : %.2f " , timeElapsed);
		}
		sc.close();
	}
}
