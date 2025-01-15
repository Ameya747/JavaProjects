package com.Wipro.bankapplication.model;

public class Account {
	private String AccountHolderName;
	private String PanCardNo;
	private long AddhaarCardNo;
	private long PhoneNo;
	private String EmailID;
	private double Balance;
	private int Mpin;
	private int AccountNo;
	
	
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	
	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	public void setMpin(int Mpin) {
		this.Mpin = Mpin;
	}
	
	public int getMpin() {
		return Mpin;
	}
	
	public void setAccountHolderName(String AccountHolderName) {
		this.AccountHolderName = AccountHolderName;
	}
	public String getPanCardNo() {
		return PanCardNo;
	}
	public void setPanCardNo(String PanCardNo) {
		this.PanCardNo = PanCardNo;
	}
	public long getAddhaarCardNo() {
		return AddhaarCardNo;
	}
	public void setAddhaarCardNo(long AddhaarCardNo) {
		this.AddhaarCardNo = AddhaarCardNo;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long PhoneNo) {
		this.PhoneNo = PhoneNo;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String EmailID) {
		this.EmailID = EmailID;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	@Override
	public String toString() {
		return "Account [AccountHolderName=" + AccountHolderName + ", PanCardNo=" + PanCardNo + ", AddhaarCardNo="
				+ AddhaarCardNo + ", PhoneNo=" + PhoneNo + ", EmailID=" + EmailID +"]";
	}
}
