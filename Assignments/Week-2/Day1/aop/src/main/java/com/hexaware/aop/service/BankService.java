package com.hexaware.aop.service;

import org.springframework.stereotype.Service;

import com.hexaware.aop.exception.InsuffFundExcep;

@Service
public class BankService {
	
	public void loginCheck() {System.out.println("Login successfull...");}
	
	public void deposit() {
	
	System.out.println("Amount depositted successfully..");
	
}
	public void withdraw() {
		
		System.out.println("Amount withdrawl successfully..");
		
	}
	public void fundTransfeer() {
		
		System.out.println("Fund Transferred successfully..");
		
	}
	public int checkBalance(int acno) throws InsuffFundExcep {
		int balance = 50000;
		if(acno < 0) {
		return balance;}
		else {
			// throw exceptions
			throw new InsuffFundExcep();
		}
		
	}
}
	

