/* Program :- Find the Factorial of a number   
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

public class Factorial {
	public static void main ( String[] args ) {
	Scanner sc = new Scanner ( System.in ) ;
	int fact = 1;
	System.out.print ( "Enter a number: " ) ;
	int num = sc.nextInt();
    for ( int i=num; i>=1; --i)
		fact = fact * i;
	System.out.println ( "Factorial is: "+fact );
	}
}