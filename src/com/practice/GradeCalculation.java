package com.practice;

import java.util.Scanner;
public class GradeCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks : ");
		int marks = sc.nextInt();
		
		if(marks<0 || marks>100) {
			System.out.println("Invalid Marks");
		}
		else {
			char grade = 'F';
			if(marks>=90) {
				grade = 'A';
			}
			else if(marks>=80) {
				grade = 'B';
			}
			else if(marks>=70) {
				grade = 'C';
			}
			else if(marks>=60) {
				grade = 'D';
			}
			else if(marks<60) {
				grade = 'F';
			}
				
			System.out.println("Your grades are : "+ grade);
		}
		

	}

}
