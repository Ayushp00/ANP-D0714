package com.practice;

import java.util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number : ");
		int num = sc.nextInt();
		int a = num;
		int last = 0;
		do {
			last += a%10;
			a= a/10;
			
		}while(a>0);
		System.out.println("THe sum of the digit of "+num+" is : "+last);
	}

}
