package com.startjava.lesson1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		
		int j = 6;
		while(j >= -6) {
			System.out.print(j + " ");
			j -= 2;
		}
		
		System.out.println();
		
		int res = 0;
		int k = 11;
		do {
			if(k % 2 != 0) {
				res += k;
			}
			k++;
		} while(k <= 20);

		System.out.println(res);
	}
}