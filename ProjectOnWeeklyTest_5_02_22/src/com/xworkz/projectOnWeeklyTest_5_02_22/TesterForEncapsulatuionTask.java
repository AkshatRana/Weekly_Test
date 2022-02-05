package com.xworkz.projectOnWeeklyTest_5_02_22;
import com.xworkz.projectOnWeeklyTest_5_02_22.Encapsulation_Task.Bank;
public class TesterForEncapsulatuionTask {
	public static void main(String[] args) {
		Bank dtos = new Bank();
		
		dtos.setBankName("State Bank Of India");
		String bankName = dtos.getBankName();
		System.out.println(bankName);
		
		dtos.setBranchName("Katriguppe Branch");
		String branchName = dtos.getBranchName();
		System.out.println(branchName);
		
		dtos.setAccHolderName("Akshat Rana");
		String accHolderName = dtos.getAccHolderName();
		System.out.println(accHolderName);
		
		dtos.setAccNumber(356984526795L);
		long accNumber = dtos.getAccNumber();
		System.out.println(accNumber);
		
		dtos.setAtmPin(4422);
		int atmPin = dtos.getAtmPin();
		System.out.println(atmPin);
		
		dtos.setAccType("State Bank Of India");
		String accType = dtos.getAccType();
		System.out.println(accType);
		
		dtos.setBalance(2560.13f);
		float balance = dtos.getBalance();
		System.out.println(balance);
		
	}
	
	

}
