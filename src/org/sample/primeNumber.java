package org.sample;

public class primeNumber {

	public static void main(String[] args) {
		
		int i,j,num;
		
		
		System.out.println("prime numbers from 1 to 10");
		for ( i = 2; i <=10; i++) {
			num = 0;
			for ( j = 2;  j<i; j++) {
		}
		
			if (i%j==0) {
			
				num++;
				break;
			}
			if (num==0) {
				System.out.println(i);
		}
		
		}
	}
	
}
