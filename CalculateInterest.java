

/* Program :- Write a Java program to create an Account class. Define proper constructor(s) for this class. Define methods to calculate Simple interest and Compound interest on the amount deposited in the account. Make necessary assumptions, 
wherever required. 
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


class Account{
	private double principal;
	private double time;
	private double rate;
	
	public Account(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Principal: ");
	principal=sc.nextDouble();
	System.out.print("Enter the Time: ");
	time=sc.nextDouble();
	System.out.print("Enter the Rate: ");
	rate=sc.nextDouble();
	}
	
	public void calculateSimple(){
		double cs=principal*time*rate;
		System.out.println("Simple Interest is: "+(cs/100));
	}
	
	public void calculateCompound(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of times interest:");
		int n=sc.nextInt();
		double cc=principal*Math.pow((1+rate/n),n*time);
		System.out.println("Compound Interest is: "+(cc-principal));
	}
}


public class CalculateInterest{
	public static void main(String [] args){
		Account acc=new Account();
		acc.calculateSimple();
		acc.calculateCompound();
	}
}


/*
Output:- 

Enter the Principal: 3400
Enter the Time: 3
Enter the Rate: 4
Simple Interest is: 408.0
Enter number of times interest:
2
Compound Interest is: 2475200.0


*/