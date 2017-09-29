/*  Program : Conversion of Temperature From  Celsius (°C) - Fahrenheit (°F) Conversion 
						and its Reciprocal-
*
*
*
Author - Ayush Gupta
M. No.- 8745056594 
*
*
*
Basic Formula-
F-C ---> subtract by 32 multiplied by 5 divide by 9
C-F ---> multiplied by 9 divide by 5 add 32
*
*/
import java.util.*;
public class TemperatureConversion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Fahrenheit: ");
		int f=sc.nextInt();
		int result=(((f-32)*5)/9);
		System.out.println("In celsius: "+result);
		
		System.out.print("Enter Celsius: ");
		int c=sc.nextInt();
		int r=(((c*9)/5)+32);
		System.out.println("In Fahrenheit: "+r);
	}
}

/* OutPut: 
Enter Fahrenheit: 230
In celsius: 110
Enter Celsius: 110
In Fahrenheit: 230
*/