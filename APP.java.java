package com.oop;
public class APP {

public static void main(String[] args) {

BankAccount jacobsAccount = new BankAccount();
BankAccount useAccount = new BankAccount();
jacobsAccount.accountHolder = "Jacob";
jacobsAccount.balance = 100;
System.out.println("Before deposit:" + jacobsAccount.balance);
jacobsAccount.deposit(100);
System.out.println("After deposit:" + jacobsAccount.balance);
System.out.println(useAccount.balance);
}
}





