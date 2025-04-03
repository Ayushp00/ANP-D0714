package com.practice;

import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your Array : ");
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Inserted Successfully ");
		
		int largest = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				largest = arr[i];
			}
			
		}
		System.out.println("The largest Element is the Array is : "+largest);
		

	}

}
