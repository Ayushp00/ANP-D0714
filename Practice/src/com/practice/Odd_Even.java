package com.practice;

import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("The number "+num+" is Even");
			}
			else {
				System.out.println("The number "+num+" is Odd");
			}
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
