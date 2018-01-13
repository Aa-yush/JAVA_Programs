/* Program :-Print Upto number of Fabonicii series   
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

class Series{
	private int size;
	
	public Series(int size){
		this.size=size;
	}
	public void makingSeries(){
	int a=0;
	int b=1;
	System.out.print(a+" ");
	System.out.print(b+" ");
	int c=a+b;
		while(c<=size){
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
			
		}
	}
}




public class Fabo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("UPTO numbers in series: ");
		int a=sc.nextInt();
		Series sr=new Series(a);
		sr.makingSeries();
		
	}
	
}

/*
Output:
UPTO numbers in series: 20
0 1 1 2 3 5 8 13

*/
