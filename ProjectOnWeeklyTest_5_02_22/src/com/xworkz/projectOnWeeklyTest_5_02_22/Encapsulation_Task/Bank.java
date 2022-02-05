package com.xworkz.projectOnWeeklyTest_5_02_22.Encapsulation_Task;

public class Bank {
		private String bankName;
		private String branchName;
		private String accHolderName;
		private long accNumber;
		private int atmPin;
		private String accType;
		private float balance;
		
		public Bank() {
		}
		
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getBankName() {
			return bankName;
		}

		
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}		
		public String getBranchName() {
			return branchName;
		}

		
		public void setAccHolderName(String accHolderName) {
			this.accHolderName = accHolderName;
		}
		public String getAccHolderName() {
			return accHolderName;
		}

		
		public void setAccNumber(long accNumber) {
			this.accNumber = accNumber;
		}
		public long getAccNumber() {
			return accNumber;
		}

		
		public void setAtmPin(int atmPin) {
			this.atmPin = atmPin;
		}
		public int getAtmPin() {
			return atmPin;
		}

		
		public void setAccType(String accType) {
			this.accType = accType;
		}
		public String getAccType() {
			return accType;
		}

		
		public void setBalance(float balance) {
			this.balance = balance;
		}
		public float getBalance() {
			return balance;
		}
	
}
