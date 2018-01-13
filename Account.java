
/* Program :- Write a Java program to create an account class. Define appropriate 
constructor for this class. Define and implement method to display account balance and 
withdraw money. Show appropriate message if there is an attempt to withdraw money which 
may lead to account balance, less than minimum amount required in account.
 Make necessary assumptions required.    
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/


import java.util.*;

class AccountDetails{
	private double accntbal;
	
	public AccountDetails(double accntbal){
		this.accntbal=accntbal;
	}
	
	public void withdrawAmt(int wa){
		if(wa<=accntbal)
			accntbal=accntbal-wa;
		else
			System.out.println("Your current balance below the Withdraw Amount");
	}
	
	public void display(){
		System.out.println("Current Balance: "+accntbal);
	}
	
	
	
}

public class Account{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	AccountDetails ad=new AccountDetails(1000.00);
	System.out.print("Enter the amount you want to withdraw:");
	int wd=sc.nextInt();
	ad.withdrawAmt(wd);
	ad.display();
	
	}
}

/*
OutPut:-

Enter the amount you want to withdraw:700
Current Balance: 300.0

Enter the amount you want to withdraw:1100
Your current balance below the Withdraw Amount
Current Balance: 1000.0

*/