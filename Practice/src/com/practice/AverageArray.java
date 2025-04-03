package com.practice;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array Size : ");
		int n = sc.nextInt();
		System.out.println("Enter your Array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Inserted Successfully");
		
		int sum=0;
		for(int m:arr) {
			sum += m;
		}
		
		double avg = sum/n;
		
		System.out.println("The average of your Array is : "+avg);

	}

}
