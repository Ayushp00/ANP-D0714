package com.practice;

import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the number to print Table : ");
		int num = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.print(num+" * "+i+" = ");
			int mul = num*i;
			i++;
			System.out.println(mul);
		}

	}

}
