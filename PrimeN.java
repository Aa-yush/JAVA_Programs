/* Program :- Find the number is prime or not   
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

public class PrimeN {
	public static void main ( String[] args ) { 
		Scanner sc = new Scanner ( System.in ) ;
		
		System.out.print ( "Enter N number: " );
		int n = sc.nextInt();
		
		int i;
	    for ( i=2; i<n; i++ )  
			if(n%i==0)         
				break;
			
			
			if(i==n)
				System.out.println("Number is Prime");
			else
				System.out.println("Number is not Prime");
	}
}