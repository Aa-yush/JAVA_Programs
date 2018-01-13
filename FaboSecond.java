/* Program :-Print Upto N number of Fabonicii series   
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
	int var[]=new int [size];
	var[0]=0;
	var[1]=1;
	System.out.print(var[0]+" ");
	System.out.print(var[1]+" ");
	var[2]=var[0]+var[1];
	
	for(int i=2;i<size;){
		try{
			
		System.out.print(var[i]+" ");
		++i;
		var[i]=var[i-1]+var[i-2];
		}catch(Exception e){}
	}
		
	}
}




public class FaboSecond{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers in series: ");
		int a=sc.nextInt();
		Series sr=new Series(a);
		sr.makingSeries();
		
	}
	
}

/*
Output:
How many numbers in series: 10
0 1 1 2 3 5 8 13 21 34

*/
