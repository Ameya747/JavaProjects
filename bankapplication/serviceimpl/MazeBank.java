package com.Wipro.bankapplication.serviceimpl;

import java.util.Scanner;

import com.Wipro.bankapplication.model.Account;
import com.Wipro.bankapplication.service.RBI;

public class MazeBank implements RBI {

	Scanner Sc = new Scanner(System.in);
	Account accounts[] = new Account[100];

	@Override
	public void createAccount() {
		String Choice;
		for (int i = 0; i < accounts.length; i++) {
			Account ac = new Account();
			System.out.print("Enter Your Full Name :");
			ac.setAccountHolderName(Sc.next());
			System.out.print("Enter your PanCardNo :");
			ac.setPanCardNo(Sc.next());
			System.out.print("Enter Your AdhaarCard No: ");
			ac.setAddhaarCardNo(Sc.nextLong());
			System.out.print("Enter Account No");
			ac.setAccountNo(Sc.nextInt());
			System.out.print("Enter Phone Number : ");
			ac.setPhoneNo(Sc.nextLong());
			System.out.print("Enter Your Email : ");
			ac.setEmailID(Sc.next());
			System.out.print("Enter Mpin For your Account: ");
			ac.setMpin(Sc.nextInt());
			System.out.print("Enter the amount you want to Deposit : ");
			ac.setBalance(Sc.nextDouble());
			accounts[i] = ac;
			System.out.print("Do You Wish To Continue Type Y/N : ");
			Choice = Sc.next();
			if (Choice.equalsIgnoreCase("N")) {
				System.out.println("Account creation process terminated.");
				break;
			} else if (!Choice.equalsIgnoreCase("Y")) {
				System.out.println("Invalid choice. Terminating the process.");
				break;
			}

		}
		System.out.println("Accounts Created Successfully");
	}

	@Override
	public void showAccountDetails() {
		// TODO Auto-generated method stub
		System.out.print("Enter Your Account No");
		int AccountNo = Sc.nextInt();
		System.out.println("Enter Accounts Mpin");
		int mpin = Sc.nextInt();
		for (Account accobj : accounts) {
			if (accobj != null) {
				if (accobj.getMpin() == mpin && accobj.getAccountNo() == AccountNo) {
					System.out.println("Account info : " + accobj.toString());
				}

			}
		}

	}

	@Override
	public void FetchBalance() {
		// TODO Auto-generated method stub
		System.out.println("Enter Account No : ");
		int AccountNo = Sc.nextInt();
		System.out.print("Enter Mpin For Your Account : ");
		int Mpin = Sc.nextInt();
		for (Account accobj : accounts) {
			if (accobj != null) {
				if (accobj.getAccountNo() == AccountNo && accobj.getMpin() == Mpin) {
					System.out.println("Balance :" + accobj.getBalance());
				}
			}

		}

	}

	@Override
	public double widhrawBalance() {
		// TODO Auto-generated method stubA
		double Widhrawamt;
		System.out.print("Enter Account No : ");
		int AccountNo = Sc.nextInt();
		System.out.print("Enter Mpin : ");
		int Mpin = Sc.nextInt();
		for (Account accobj : accounts) {
			if (accobj != null) {
				if (accobj.getAccountNo() == AccountNo && accobj.getMpin() == Mpin) {
					System.out.print("Enter The Amount you want to Widhraw : ");
					Widhrawamt = Sc.nextDouble();
					if (Widhrawamt <= accobj.getBalance()) {
						accobj.setBalance(accobj.getBalance() - Widhrawamt);
						System.out.println("Amount Widhrawal Successfull");

					} else {
						System.out.println("Insufficient Balance");
					}

				} 
			}

		}

		return 0;
	}

	@Override
	public void depositmoney() {
		// TODO Auto-generated method stub

		double DepositAmt, Mpin, AccountNo;
		System.out.println("Enter Your Account No : ");
		AccountNo = Sc.nextInt();
		System.out.print("Enter Your Mpin : ");
		Mpin = Sc.nextInt();
		for (Account accobj : accounts) {
			if (accobj != null) {
				if (accobj.getAccountNo() == AccountNo && accobj.getMpin() == Mpin) {
					System.out.println("Enter Amount You Wish To Deposit");
					DepositAmt = Sc.nextDouble();
					accobj.setBalance(accobj.getBalance() + DepositAmt);
				}
			}
		}

		System.out.println("Amount Deposited Successfully");

	}

	@Override
	public void updateAccountDetails() {
		// TODO Auto-generated method stub
		int choice;
		boolean Flag = true;
		int Mpin, AccountNo;
		while (Flag) {
			System.out.println("______________________");
			System.out.println("1.Update PhNo");
			System.out.println("2.Update Email ID");
			System.out.println("3.Exit");
			System.out.println("_______________________");
			System.out.print("Enter Your Choice");
			choice = Sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Your Account No :");
				AccountNo = Sc.nextInt();
				System.out.print("Enter Your Mpin : ");
				Mpin = Sc.nextInt();
				for (Account accobj : accounts) {
					if (accobj != null) {
						if (accobj.getAccountNo() == AccountNo && accobj.getMpin() == Mpin) {
							System.out.println("Enter New Ph No");
							accobj.setPhoneNo(Sc.nextLong());
						}
					}
				}
				System.out.println("Changes Made Successfully....");
				break;
			case 2:
				System.out.println("Enter Your Account No :");
				AccountNo = Sc.nextInt();
				System.out.print("Enter Your Mpin : ");
				Mpin = Sc.nextInt();
				for (Account accobj : accounts) {
					if (accobj != null) {
						if (accobj.getAccountNo() == AccountNo && accobj.getMpin() == Mpin) {
							System.out.println("Enter New Email Id");
							accobj.setPhoneNo(Sc.nextLong());
						}
					}
				}
				System.out.println("Changes Made Successfully....");
				break;

			case 3:
				Flag = false;
				break;
			default:
				System.out.println("Please Enter Valid Choice");
				break;
			}
		}

	}

}
