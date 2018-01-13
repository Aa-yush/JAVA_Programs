
/* Program :- Concept of Bubble Sort     
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



public class BubbleSort{
	public static void main(String[] args){
		int Array[]={30,10,40,5};
		int temp;
		for(int j=1;j<4;j++){
		for(int i=0;i<4-j;i++){
			if(Array[i]>Array[i+1]){
				temp=Array[i];
				Array[i]=Array[i+1];
				Array[i+1]=temp;
			}
		}
	 }
		System.out.println("Sorted Element is : ");
		for(int i=0;i<4;i++)
			System.out.print(" "+Array[i]);
	}
}

/*
Output:-
Sorted Element is :
 5 10 30 40

*/
