package com.practice;

import java.util.Scanner;
public class Bank {
    
    double amount;
    Bank(double amount) {
        this.amount = amount;
    }
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)? "Withdraw successful": "Not enough balance";
        System.out.println(message);
        amount = (withdrawalAmount <= amount) ? amount - withdrawalAmount : amount;
    }
    void deposit(double depositAmount) {
        amount = amount + depositAmount;
        System.out.println("Deposit successful");
    }
    void showBalance() {
        System.out.println("Final Balance: " + amount);
    }
    public static void main(String[] args) {
        Bank myBank = new Bank(10000);
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("Choose Any : ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            
            int choice = sc.nextInt();
        switch(choice) {
        case 1 :
        	System.out.println("Enetr the withdraw amount : ");
        	int wamount = sc.nextInt();
        	myBank.withdraw(wamount); 
        	break;
        case 2 :
        	System.out.println("Enetr the Deposite amount : ");
        	int damount = sc.nextInt();
        	myBank.deposit(damount);
        	break;
        case 3:
        	myBank.showBalance(); 
        	break;
        }
        }
    }
}