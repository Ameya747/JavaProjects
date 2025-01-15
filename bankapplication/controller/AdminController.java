package com.Wipro.bankapplication.controller;


import java.util.Scanner;

import com.Wipro.bankapplication.controller.AdminController;
import com.Wipro.bankapplication.service.RBI;
import com.Wipro.bankapplication.serviceimpl.MazeBank;

public class AdminController {
	private int Choice;
	Scanner S = new Scanner(System.in);
	public void MainMenu() {
		System.out.println("________________________________________________");
		System.out.println("|----------1.Create A Bank Account-------------|");
		System.out.println("|----------2.Show Bank Account Details---------|");
		System.out.println("|----------3.Fetch Account Balance-------------|");
		System.out.println("|----------4.Widhraw Amount--------------------|");
		System.out.println("|----------5.Deposit Amount--------------------|");
		System.out.println("|----------6.Update Account Details------------|");
		System.out.println("|----------7.Exit------------------------------|");
		System.out.println("|----------Enter Choices 1-7-------------------|");
		System.out.println("|______________________________________________|");
		
		
	}
	public int Choiceinput() {
		System.out.print("Enter Your Choice : ");
		Choice=S.nextInt();
		return Choice;
	}
	
	public static void main(String[] args) {
		System.out.println("-----------Welcome To Maze Bank-----------");
		boolean Flag = true;
		AdminController Admin = new AdminController();
		RBI R = new MazeBank();
		while(Flag) {
			Admin.MainMenu();
			switch(Admin.Choiceinput()){
			case 1:
				R.createAccount();
				break;
			case 2:
				R.showAccountDetails();
				break;
			case 3:
				R.FetchBalance();
				break;
			case 4:
				R.widhrawBalance();
				break;
			case 5:
				R.depositmoney();
				break;
			case 6:
				R.updateAccountDetails();
				break;
			case 7:
				System.out.println("Exiting Application");
				Flag=false;
				break;
			default:
				System.out.println("Enter A valid Choice");
				break;
			}
		}
		System.out.println("Application Exited Successfully");
	}
	
}

