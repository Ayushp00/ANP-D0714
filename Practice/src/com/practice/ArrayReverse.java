package com.practice;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your Array Size : ");
		int size = sc.nextInt();
		System.out.println(" Enter your Array : ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Inserted Successful\n");
		
		System.out.println("Your Reversed Array is : ");
		int left=0,rigth=size-1;
		while(left<rigth) {
			int temp = arr[left];
			arr[left] = arr[rigth];
			arr[rigth] = temp;
			
			left++;
			rigth--;
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}

}
