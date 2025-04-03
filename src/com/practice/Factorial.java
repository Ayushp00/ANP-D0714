package com.practice;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int value=1;
		for(int i=num;i>0;i--) {
			System.out.print(value+" * "+i+"= ");
			value*=i;
			System.out.println(value);
		}
		System.out.println(" The factorial is : "+value);

	}

}
