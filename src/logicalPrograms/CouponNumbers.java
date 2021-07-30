package logicalPrograms;

import java.util.Scanner;

public class CouponNumbers {
	
	public static boolean checkValueExist(int couponNumber,int[] couponArray) {
		
		for(int value : couponArray){
			if(value == couponNumber){
		        return true;
		    }
		}		
		return false;
	}
	
	public static int[] coupon(int count) {
		
		int max = 100;
		int	min = 10;
		int i = 0;
		int[] couponArr = new int[count];
		do {
			int couponNumber = (int)(Math.random()*(max-min+1)+min);
			
			// if exist returns true else false
			boolean presentOrNot = checkValueExist(couponNumber,couponArr);
			if(presentOrNot == false) {
				couponArr[i] = couponNumber;
				i++;
			}
		}while(i < count);
		return couponArr;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of coupon number : ");
		int count = sc.nextInt();
		if(count > 0){
			int[] couponNumber = coupon(count);
			for(int i=0; i<count; i++){
				System.out.print(couponNumber[i] + " ");
			}
		}
		sc.close();
	}
}
